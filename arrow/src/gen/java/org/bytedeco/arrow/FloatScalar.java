// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FloatScalar extends BaseFloatScalar {
    static { Loader.load(); }

  
  
    public FloatScalar(@Cast("arrow::NumericScalar<arrow::FloatType>::ValueType") float value) { super((Pointer)null); allocate(value); }
    private native void allocate(@Cast("arrow::NumericScalar<arrow::FloatType>::ValueType") float value);
  
    public FloatScalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatScalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FloatScalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FloatScalar position(long position) {
        return (FloatScalar)super.position(position);
    }
    @Override public FloatScalar getPointer(long i) {
        return new FloatScalar((Pointer)this).position(position + i);
    }

}
