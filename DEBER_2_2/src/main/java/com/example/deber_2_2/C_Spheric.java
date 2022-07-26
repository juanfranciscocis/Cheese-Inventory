package com.example.deber_2_2;

public class C_Spheric extends C_Cheese{
    //DATA MEMBERS
        //NONE

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_Spheric(float basePrice, float unitPrice, float radio) {
        super(basePrice, unitPrice, radio);
    }

    //FUCTION MEMBERS
    //VOLUME -> C_CHEESE
    @Override
    public float volume() {
        return (float) (4/3*Math.PI*Math.pow(radio,3));
    }
}
