// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;

// #endif

/**
 *  \mainpage
 * 
 *  This is the API documentation for the NVIDIA TensorRT library. It provides information on individual functions, classes
 *  and methods. Use the index on the left to navigate the documentation.
 * 
 *  Please see the accompanying user guide and samples for higher-level information and general advice on using TensorRT.
 *  TensorRT Versioning follows Semantic Versioning Guidelines specified here: https://semver.org/
 * 
 <p>
 * 
 *  \file NvInfer.h
 * 
 *  This is the top-level API file for TensorRT.
 *  */

// forward declare some CUDA types to avoid an include dependency

@Opaque @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class cublasContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cublasContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cublasContext(Pointer p) { super(p); }
}
