// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvparsers;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvparsers.*;

@Namespace("ditcaffe") @Opaque @Properties(inherit = org.bytedeco.tensorrt.presets.nvparsers.class)
public class NetParameter extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NetParameter() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NetParameter(Pointer p) { super(p); }
}
