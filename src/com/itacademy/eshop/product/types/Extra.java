package com.itacademy.eshop.product.types;

public class Extra {
    private String name;
    private String lastName;
    private Integer age;


    public Extra(String name, String lName, Integer a) {
        this.name = name;
        this.lastName = lName;
        this.age = a;
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

