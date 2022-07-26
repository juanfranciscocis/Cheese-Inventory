package com.example.deber_2_2;

import java.util.ArrayList;

public class C_Invoice {
    //DATA MEMBERS
    private String invoiceName;
    private String invoiceAdress;
    private int invoicePhone;
    private float subtotal;



    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_Invoice(String invoiceName, String invoiceAdress, int invoicePhone) {
        this.invoiceName = invoiceName;
        this.invoiceAdress = invoiceAdress;
        this.invoicePhone = invoicePhone;
    }

    //GETTERS AND SETTERS
    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceAdress() {
        return invoiceAdress;
    }

    public void setInvoiceAdress(String invoiceAdress) {
        this.invoiceAdress = invoiceAdress;
    }

    public int getInvoicePhone() {
        return invoicePhone;
    }

    public void setInvoicePhone(int invoicePhone) {
        this.invoicePhone = invoicePhone;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }


    //CALC SUBTOTAL
    public float subtotal(int quantity, C_Cheese cheeseType){
        subtotal += quantity * cheeseType.cost();

        return this.subtotal;
    }






}
