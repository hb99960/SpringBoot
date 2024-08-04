package com.learn.beanCreation;

public class MyBean {
    private String message;

    /** it will automatically called because of config in xml file */
    public void setMessage(String message){
        this.message = message;
    }

    public void showMessage(){
        System.out.println("Message: " + message);
    }

    public String toString(){
        return "MyBean{message = " + message + "}";
    }
}
