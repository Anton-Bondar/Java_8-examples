package com.anbo.reference_to_static_method;

/**
 * Created by anbo06131 on 9/29/2017.
 */
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
