package com.example.deber_2_2;

public class C_Cilindric extends C_Cheese{
    //DATA MEMBERS
    protected float lenght;

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_Cilindric(float basePrice, float unitPrice, float radio, float lenght) {
        super(basePrice, unitPrice, radio);
        this.lenght = lenght;
    }

    //GETTERS AND SETTERS


    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    //VOLUME -> C_CHEESE
    @Override
    public float volume() {
        return (float) (Math.PI*Math.pow(radio,2)*lenght);
    }
}
