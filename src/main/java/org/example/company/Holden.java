package org.example.company;

public class Holden extends Car{

    public Holden(int cylinders,String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "Holden brand car's engine is starting";
    }

    @Override
    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "Holden brand car is accelerating";
    }

    @Override
    public String brake(){

        System.out.println(getClass().getSimpleName());
        return "Holden brand car is braking";
    }


}
