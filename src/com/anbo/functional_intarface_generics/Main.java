package com.anbo.functional_intarface_generics;

import java.math.BigInteger;

/**
 * Created by anbo06131 on 9/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        GetClass<BigInteger> getClassFunc = (s)->s.getClass().getSimpleName();
        System.out.println(getClassFunc.getClassName(BigInteger.ONE));
    }
}
