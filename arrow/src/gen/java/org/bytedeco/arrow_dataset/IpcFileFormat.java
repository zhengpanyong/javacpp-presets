// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A FileFormat implementation that reads from and writes to Ipc files */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class IpcFileFormat extends FileFormat {
    static { Loader.load(); }
    /** Default native constructor. */
    public IpcFileFormat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IpcFileFormat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IpcFileFormat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IpcFileFormat position(long position) {
        return (IpcFileFormat)super.position(position);
    }
    @Override public IpcFileFormat getPointer(long i) {
        return new IpcFileFormat((Pointer)this).position(position + i);
    }

  public native @StdString String type_name();

  public native @Cast("bool") boolean Equals(@Const @ByRef FileFormat other);

  public native @Cast("bool") boolean splittable();

  public native @ByVal BoolResult IsSupported(@Const @ByRef FileSource source);

  /** \brief Return the schema of the file if possible. */
  public native @ByVal SchemaResult Inspect(@Const @ByRef FileSource source);

  /** \brief Open a file for scanning */
  public native @ByVal ScanTaskIteratorResult ScanFile(@SharedPtr ScanOptions options,
                                      @SharedPtr ScanContext context,
                                      FileFragment fragment);

  public native @ByVal FileWriterResult MakeWriter(
        @SharedPtr OutputStream destination, @SharedPtr @ByVal Schema schema,
        @SharedPtr FileWriteOptions options);

  public native @SharedPtr FileWriteOptions DefaultWriteOptions();
}
