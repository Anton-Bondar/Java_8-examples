package com.anbo.functional_interface;

/**
 * Created by anbo06131 on 9/28/2017.
 */
public class Main {
    public static void main(String[] args) {
      MyNumber myNum = () -> Math.random() * 100;
      System.out.println("Random number: "+myNum.getValue());

      NumericTest test = (n) ->n % 2 == 0;
      System.out.println("Is numeric: "+test.test(2));

        FactorialFunction function = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result ;
                return result ;
        };
        System.out.println ("Factorial of З number " + function.func(3));
        System.out.println ("Factorial of 5 number " + function.func(5));
    }
}
