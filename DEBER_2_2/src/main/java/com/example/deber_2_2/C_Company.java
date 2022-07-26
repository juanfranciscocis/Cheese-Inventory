package com.example.deber_2_2;

public class C_Company {
    //DATA MEMBERS
    private float total;

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_Company(){
    }
    //GETTERS AND SETTERS
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    //TOTAL
    public float totalEarns(C_InvoiceControl c_invoiceControl){
        System.out.println("RUNNING");
        for (int i=0;i<c_invoiceControl.getInvoiceArrayList().size();i++){
            this.total+= c_invoiceControl.getInvoiceArrayList().get(i).getSubtotal();
            System.out.println(this.total);
        }

        return this.total;
    }


}
