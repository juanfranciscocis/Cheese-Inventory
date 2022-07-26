package com.example.deber_2_2;

import java.util.ArrayList;

public class C_InvoiceControl {
    //DATA MEMBERS
    private ArrayList<C_Invoice> invoiceArrayList = new ArrayList<>();

    //FUCNTION MEMBERS
    //CONSTRUCTOR
    public C_InvoiceControl(){}

    //GETTERS AND SETTERS
    public ArrayList<C_Invoice> getInvoiceArrayList() {
        return invoiceArrayList;
    }

    public void setInvoiceArrayList(C_Invoice invoiceArrayList) {
        this.invoiceArrayList.add(invoiceArrayList);
    }
}
