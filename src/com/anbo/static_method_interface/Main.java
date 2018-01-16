package com.anbo.static_method_interface;

import java.util.Arrays;

/**
 * Created by anbo06131 on 9/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Myrzic",7);
        Cat secondCat = new Cat("Umka",1);
        Cat thirdCat = new Cat("Kuza",4);
        Cat fourCat = new Cat("Murka",2);

        Cat [] cats = new Cat[] {firstCat,null,secondCat,thirdCat,fourCat};


        Arrays.sort(cats, (oneCat, twoCat)->
                CheckNull.checkNull(oneCat,twoCat) != CheckNull.NOT_NULL
                ?CheckNull.checkNull(oneCat,twoCat)
                :oneCat.getAge()-twoCat.getAge()
        );


        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }
}
