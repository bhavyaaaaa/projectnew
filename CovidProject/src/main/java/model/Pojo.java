package model;

import database.DatabaseInterface;

public class Pojo extends DatabaseInterface {

    public Long aadhar;
    String name, age;
    int stock;
    public static int total_dose;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getAadhar() {
        return aadhar;
    }
    public void setAadhar(Long aadhar) {
        this.aadhar = aadhar;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String  age) {
        this.age = age;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
}