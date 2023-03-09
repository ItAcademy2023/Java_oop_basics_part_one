package com.itacademy.eshop.product;

public class Author {
    private String username;
    private String useremail;

    public Author(String username, String useremail) {
        this.username = username;
        this.useremail = useremail;
    }

    public void setUserName(String username) {
        this.username=username;
    }

    public void setUserEmail(String username) {
        this.useremail=useremail;
    }

    public String getUsername() {
        return this.username;
    }

    public String getUseremail() {
        return this.useremail;

    }

}
