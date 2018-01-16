package com.anbo.pass_lambda_as_argument;

/**
 * Created by anbo06131 on 9/28/2017.
 */
public class LambdasAsArgumentsDemo {

    public static void main(String[] args) {
        String inStr = "Лямбда - выражения повышают эффективность Java";
        String outStr;

        System.out.println("Source string: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr) ;

        System.out.println("String in upper case: " + outStr);
    }

    private static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }


}
