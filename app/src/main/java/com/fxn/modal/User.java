package com.fxn.modal;

import java.io.Serializable;

/**
 * Created by akshay on 02/03/18.
 */

public class User implements Serializable {

    private String Name;
    private String Age;

    public User(String name, String age) {
        Name = name;
        Age = age;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}
