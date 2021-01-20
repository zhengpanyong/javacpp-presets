// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


// ----------------------------------------------------------------------
// Value comparator interfaces

/** \brief Base class for value comparators. Generally used with
 *  TypedComparator<T> */
@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class Comparator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Comparator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Comparator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Comparator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Comparator position(long position) {
        return (Comparator)super.position(position);
    }
    @Override public Comparator getPointer(long i) {
        return new Comparator((Pointer)this).position(position + i);
    }


  /** \brief Create a comparator explicitly from physical type and
   *  sort order
   *  @param physical_type [in] the physical type for the typed
   *  comparator
   *  @param sort_order [in] either SortOrder::SIGNED or
   *  SortOrder::UNSIGNED
   *  @param type_length [in] for FIXED_LEN_BYTE_ARRAY only */
  public static native @SharedPtr Comparator Make(org.bytedeco.parquet.Type.type physical_type,
                                            SortOrder.type sort_order,
                                            int type_length/*=-1*/);
  public static native @SharedPtr Comparator Make(org.bytedeco.parquet.Type.type physical_type,
                                            SortOrder.type sort_order);
  public static native @SharedPtr Comparator Make(@Cast("parquet::Type::type") int physical_type,
                                            @Cast("parquet::SortOrder::type") int sort_order,
                                            int type_length/*=-1*/);
  public static native @SharedPtr Comparator Make(@Cast("parquet::Type::type") int physical_type,
                                            @Cast("parquet::SortOrder::type") int sort_order);

  /** \brief Create typed comparator inferring default sort order from
   *  ColumnDescriptor
   *  @param descr [in] the Parquet column schema */
  public static native @SharedPtr Comparator Make(@Const ColumnDescriptor descr);
}
