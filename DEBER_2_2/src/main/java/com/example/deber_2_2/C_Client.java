package com.example.deber_2_2;

public class C_Client {
    //DATA MEMBERS
    private String name;
    private String adress;
    private int phone;

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_Client(String name, String adress, int phone) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
