package com.itacademy.eshop.product.types;

public class Extra {
    private String name;
    private String lastName;
    private Integer age;

    public void setName(String n, String l, Integer a){
        this.name=n;
        this.lastName=l;
        this.age=a;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public Integer getAge(){
        return age;
    }

    public void setName(String s){
        this.name=s;
    }
    public void setLastName(String s){
        this.lastName=s;
    }
    public void setAge(Integer a){
        this.age=a;
    }

    }

