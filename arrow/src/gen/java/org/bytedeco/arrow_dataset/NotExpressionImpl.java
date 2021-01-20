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

@Name("arrow::dataset::ExpressionImpl<arrow::dataset::UnaryExpression,arrow::dataset::NotExpression,arrow::dataset::ExpressionType::NOT>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class NotExpressionImpl extends UnaryExpression {
    static { Loader.load(); }
    /** Default native constructor. */
    public NotExpressionImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NotExpressionImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NotExpressionImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NotExpressionImpl position(long position) {
        return (NotExpressionImpl)super.position(position);
    }
    @Override public NotExpressionImpl getPointer(long i) {
        return new NotExpressionImpl((Pointer)this).position(position + i);
    }

  @MemberGetter public static native ExpressionType.type expression_type();

  public native @SharedPtr @ByVal Expression Copy();
}
