package com.anbo.static_method_interface;

/**
 * Created by anbo06131 on 9/27/2017.
 */
public class Cat {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
