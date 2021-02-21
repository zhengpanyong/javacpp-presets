// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Decimal256Scalar extends Scalar {
    static { Loader.load(); }

  
  
    public Decimal256Scalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Decimal256Scalar(Pointer p) { super(p); }


  public Decimal256Scalar(@ByVal Decimal256 value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
  private native void allocate(@ByVal Decimal256 value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native @ByRef Decimal256 value(); public native Decimal256Scalar value(Decimal256 setter);
}