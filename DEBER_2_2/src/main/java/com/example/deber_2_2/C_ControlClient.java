package com.example.deber_2_2;

import java.util.ArrayList;

public class C_ControlClient {
    //DATA MEMBERS
    private ArrayList <C_Client> c_clients = new ArrayList<>(0);


    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_ControlClient(){
    }

    //GETTERS AND SETTERS
    public ArrayList<C_Client> getC_clients() {
        return c_clients;
    }

    public void setC_clients(C_Client c_clients) {
        this.c_clients.add(c_clients);
    }
}
