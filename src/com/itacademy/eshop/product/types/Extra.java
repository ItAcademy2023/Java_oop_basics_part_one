package com.itacademy.eshop.product.types;

public class Extra {
    private String name;
    private String lastName;
    private Integer age;


    public Extra(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setAge(Integer a) {
        this.age = a;
    }

}

