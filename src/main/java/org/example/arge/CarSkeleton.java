package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton(){
        System.out.println("Car Skeleton created");
    }

    public String startEngine(){
        return "Engine has started";
    }

    public String drive(){
        return "car is being driven";
    }

    protected String runEngine(){
        return "Engine has run";
    }



}
