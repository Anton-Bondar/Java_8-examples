package com.anbo.reference_to_static_method;

/**
 * Created by anbo06131 on 9/29/2017.
 */
public class Main {

    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        int localVariable = 0;
        Converter<Integer, String> stringConverter1 = (from) -> {
            //can't change local variable
            //localVariable ++;
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
        System.out.println("stringConverter1 "+stringConverter1.convert(1));
        System.out.println("stringConverter2 "+stringConverter2.convert(2));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.testScopes();
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted.getClass());   // 123
    }
}
