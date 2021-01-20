// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;


/** \brief Tree Builder for a nested expression. */
@Namespace("gandiva") @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class TreeExprBuilder extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TreeExprBuilder() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TreeExprBuilder(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TreeExprBuilder(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TreeExprBuilder position(long position) {
        return (TreeExprBuilder)super.position(position);
    }
    @Override public TreeExprBuilder getPointer(long i) {
        return new TreeExprBuilder((Pointer)this).position(position + i);
    }

  /** \brief create a node on a literal. */
  public static native @SharedPtr Node MakeLiteral(@Cast("bool") boolean value);
  public static native @SharedPtr Node MakeLiteral(@Cast("uint8_t") byte value);
  public static native @SharedPtr Node MakeLiteral(@Cast("uint16_t") short value);
  public static native @SharedPtr Node MakeLiteral(@Cast("uint32_t") int value);
  public static native @SharedPtr Node MakeLiteral(@Cast("uint64_t") long value);
  public static native @SharedPtr Node MakeLiteral(float value);
  public static native @SharedPtr Node MakeLiteral(double value);
  public static native @SharedPtr Node MakeStringLiteral(@StdString String value);
  public static native @SharedPtr Node MakeStringLiteral(@StdString BytePointer value);
  public static native @SharedPtr Node MakeBinaryLiteral(@StdString String value);
  public static native @SharedPtr Node MakeBinaryLiteral(@StdString BytePointer value);
  public static native @SharedPtr Node MakeDecimalLiteral(@Const @ByRef DecimalScalar128 value);

  /** \brief create a node on a null literal.
   *  returns null if data_type is null or if it's not a supported datatype. */
  public static native @SharedPtr Node MakeNull(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType data_type);

  /** \brief create a node on arrow field.
   *  returns null if input is null. */
  public static native @SharedPtr Node MakeField(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field field);

  /** \brief create a node with a function.
   *  returns null if return_type is null */
  public static native @SharedPtr Node MakeFunction(@StdString String name, @SharedPtr Node params,
                                @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType return_type);
  public static native @SharedPtr Node MakeFunction(@StdString BytePointer name, @SharedPtr Node params,
                                @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType return_type);

  /** \brief create a node with an if-else expression.
   *  returns null if any of the inputs is null. */
  public static native @SharedPtr Node MakeIf(@SharedPtr Node condition, @SharedPtr Node then_node, @SharedPtr Node else_node,
                          @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType result_type);

  /** \brief create a node with a boolean AND expression. */
  public static native @SharedPtr Node MakeAnd(@SharedPtr Node children);

  /** \brief create a node with a boolean OR expression. */
  public static native @SharedPtr Node MakeOr(@SharedPtr Node children);

  /** \brief create an expression with the specified root_node, and the
   *  result written to result_field.
   *  returns null if the result_field is null. */
  public static native @SharedPtr Expression MakeExpression(@SharedPtr Node root_node, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field result_field);

  /** \brief convenience function for simple function expressions.
   *  returns null if the out_field is null. */
  public static native @SharedPtr Expression MakeExpression(@StdString String function,
                                        @Const @ByRef FieldVector in_fields, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field out_field);
  public static native @SharedPtr Expression MakeExpression(@StdString BytePointer function,
                                        @Const @ByRef FieldVector in_fields, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field out_field);

  /** \brief create a condition with the specified root_node */
  public static native @SharedPtr Condition MakeCondition(@SharedPtr Node root_node);

  /** \brief convenience function for simple function conditions. */
  public static native @SharedPtr Condition MakeCondition(@StdString String function,
                                      @Const @ByRef FieldVector in_fields);
  public static native @SharedPtr Condition MakeCondition(@StdString BytePointer function,
                                      @Const @ByRef FieldVector in_fields);

  /** \brief creates an in expression */
  public static native @SharedPtr Node MakeInExpressionInt32(@SharedPtr Node node,
                                         @Const @ByRef IntSet constants);

  public static native @SharedPtr Node MakeInExpressionInt64(@SharedPtr Node node,
                                         @Const @ByRef LongSet constants);

  public static native @SharedPtr Node MakeInExpressionString(@SharedPtr Node node,
                                          @Const @ByRef StringSet constants);

  public static native @SharedPtr Node MakeInExpressionBinary(@SharedPtr Node node,
                                          @Const @ByRef StringSet constants);

  /** \brief Date as s/millis since epoch. */
  public static native @SharedPtr Node MakeInExpressionDate32(@SharedPtr Node node,
                                          @Const @ByRef IntSet constants);

  /** \brief Date as millis/us/ns since epoch. */
  public static native @SharedPtr Node MakeInExpressionDate64(@SharedPtr Node node,
                                          @Const @ByRef LongSet constants);

  /** \brief Time as s/millis of day */
  public static native @SharedPtr Node MakeInExpressionTime32(@SharedPtr Node node,
                                          @Const @ByRef IntSet constants);

  /** \brief Time as millis/us/ns of day */
  public static native @SharedPtr Node MakeInExpressionTime64(@SharedPtr Node node,
                                          @Const @ByRef LongSet constants);

  /** \brief Timestamp as millis since epoch. */
  public static native @SharedPtr Node MakeInExpressionTimeStamp(@SharedPtr Node node,
                                             @Const @ByRef LongSet constants);
}
