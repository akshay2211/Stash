package com.fxn.modal;

import java.io.Serializable;

/**
 * Created by akshay on 02/03/18.
 */

public class User implements Serializable {

    private String Name;
    private int Age;

    public User(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
