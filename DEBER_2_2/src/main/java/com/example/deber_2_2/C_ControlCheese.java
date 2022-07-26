package com.example.deber_2_2;

import java.util.ArrayList;

public class C_ControlCheese {
    //DATA MEMBERS
    private ArrayList <C_Cheese> cheeseArrayList = new ArrayList<>();
    //SAVING CHEESE INPUT DATA
    private ArrayList <Float> dataSpeheric = new ArrayList<Float>(4);
    private ArrayList <Float> dataCilindric = new ArrayList<Float>(5);
    private ArrayList <Float> dataCilindricHole = new ArrayList<Float>(6);

    //FUCTION MEMBER
    //CONSTRUCTOR
    public C_ControlCheese(){}

    //GETTERS AND SETTERS
    public ArrayList<Float> getDataSpeheric() {
        return dataSpeheric;
    }

    public void setDataSpeheric(float dataSpeheric) {
        this.dataSpeheric.add(dataSpeheric);
    }

    public ArrayList<Float> getDataCilindric() {
        return dataCilindric;
    }

    public void setDataCilindric(float dataCilindric) {
        this.dataCilindric.add(dataCilindric);
    }

    public ArrayList<Float> getDataCilindricHole() {
        return dataCilindricHole;
    }

    public void setDataCilindricHole(float dataCilindricHole) {
        this.dataCilindricHole.add(dataCilindricHole);
    }

    public void setCheeseArrayList(C_Cheese cheese){
        this.cheeseArrayList.add(cheese);
    }

    public ArrayList<C_Cheese> getCheeseArrayList(){
        return cheeseArrayList;
    }

    public void deleteData(int index, float numberSet,ArrayList<Float> data){
        data.add(index,numberSet);
    }


    public void deleteAllData(){
        dataSpeheric.clear();
        dataCilindric.clear();
        dataCilindricHole.clear();
        cheeseArrayList.clear();
        System.out.println("ELIMINADO ARRAY");
    }
}
