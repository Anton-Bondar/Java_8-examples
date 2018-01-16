package com.anbo.reference_to_static_method;

import com.anbo.pass_lambda_as_argument.StringFunc;

/**
 * Created by anbo06131 on 9/29/2017.
 */
class MyStringOps {
    static String strReverse(String str) {
        String result ="";
        int i;
        for(i = str.length()-1; i>=0; i--)
            result += str.charAt(i);
        return result;
    }

public static class MethodRefDemo {

    private static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда повышает эффективность java";
        String outStr;
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Source string: "+inStr);
        System.out.println("Result string: "+outStr);
    }

}
}
