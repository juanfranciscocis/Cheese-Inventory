package com.example.deber_2_2;

public abstract class C_Cheese {
    //DATA MEMBERS
    protected float basePrice;
    protected float unitPrice;
    protected float radio; //EXTERNAL RADIO

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_Cheese(float basePrice, float unitPrice, float radio) {
        this.basePrice = basePrice;
        this.unitPrice = unitPrice;
        this.radio = radio;
    }

    //GETTERS AND SETTERS
    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //VOLUME FUNCTION
    public abstract float volume();
    //COST FUNCTION
    public float cost(){
        return basePrice + unitPrice * volume();
    }
}
