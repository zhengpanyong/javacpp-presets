// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Creates the Arrow record batch file format
 * 
 *  Implements the random access file format, which structurally is a record
 *  batch stream followed by a metadata footer at the end of the file. Magic
 *  numbers are written at the start and end of the file */
@Namespace("arrow::ipc") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class RecordBatchFileWriter extends RecordBatchStreamWriter {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordBatchFileWriter(Pointer p) { super(p); }


  /** Create a new writer from stream sink and schema
   * 
   *  @param sink [in] output stream to write to
   *  @param schema [in] the schema of the record batches to be written
   *  @param out [out] the created stream writer
   *  @return Status */
  
  ///
  public static native @ByVal Status Open(OutputStream sink, @Const @SharedPtr @ByRef Schema schema,
                       @SharedPtr RecordBatchWriter out);

  /** Create a new writer from stream sink and schema
   * 
   *  @param sink [in] output stream to write to
   *  @param schema [in] the schema of the record batches to be written
   *  @return Status */
  public static native @ByVal RecordBatchWriterSharedResult Open(
        OutputStream sink, @Const @SharedPtr @ByRef Schema schema);
  
  ///
  public static native @ByVal RecordBatchWriterSharedResult Open(
        OutputStream sink, @Const @SharedPtr @ByRef Schema schema,
        @Const @ByRef IpcOptions options);

  /** \brief Write a record batch to the file
   * 
   *  @param batch [in] the record batch to write
   *  @return Status */
  public native @ByVal Status WriteRecordBatch(@Const @ByRef RecordBatch batch);

  /** \brief Close the file stream by writing the file footer and magic number
   *  @return Status */
  public native @ByVal Status Close();
}