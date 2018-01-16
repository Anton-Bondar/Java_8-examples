package com.anbo.functional_intarface_generics;

/**
 * Created by anbo06131 on 9/28/2017.
 */
@FunctionalInterface
public interface GetClass <T> {
    String getClassName(T obj);
}
