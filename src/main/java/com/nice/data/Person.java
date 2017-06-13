package com.nice.data;

/**
 * Created by Evegeny on 13/06/2017.
 */
public class Person {
    private String name;
    private int age;


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {

        return "Person(" +
                "name = '" + name + '\'' +
                ')';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
