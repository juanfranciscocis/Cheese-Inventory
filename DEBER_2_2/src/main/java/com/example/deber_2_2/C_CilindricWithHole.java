package com.example.deber_2_2;

public class C_CilindricWithHole extends C_Cilindric{
    //DATA MEMBERS
    private float internalRadio;

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_CilindricWithHole(float basePrice, float unitPrice, float radio, float lenght, float internalRadio) {
        super(basePrice, unitPrice, radio, lenght);
        this.internalRadio = internalRadio;
    }

    //GETTERS AND SETTERS
    public float getInternalRadio() {
        return internalRadio;
    }

    public void setInternalRadio(float internalRadio) {
        this.internalRadio = internalRadio;
    }

    //VOLUME -> C_CHEESE
    @Override
    public float volume() {
        return (float) (Math.PI*lenght*(Math.pow(radio,2)-Math.pow(internalRadio,2)));
    }
}
