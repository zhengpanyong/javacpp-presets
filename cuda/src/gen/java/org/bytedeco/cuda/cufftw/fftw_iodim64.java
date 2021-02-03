// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cufftw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import static org.bytedeco.cuda.global.cufft.*;

import static org.bytedeco.cuda.global.cufftw.*;

    
@Properties(inherit = org.bytedeco.cuda.presets.cufftw.class)
public class fftw_iodim64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public fftw_iodim64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public fftw_iodim64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_iodim64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public fftw_iodim64 position(long position) {
        return (fftw_iodim64)super.position(position);
    }
    @Override public fftw_iodim64 getPointer(long i) {
        return new fftw_iodim64((Pointer)this).position(position + i);
    }

    public native @Cast("ptrdiff_t") long n(); public native fftw_iodim64 n(long setter);
    public native @Cast("ptrdiff_t") long is(); public native fftw_iodim64 is(long setter);
    public native @Cast("ptrdiff_t") long os(); public native fftw_iodim64 os(long setter);
}
