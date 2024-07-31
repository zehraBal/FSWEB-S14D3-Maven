package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CarSkeleton(){
        System.out.println("Car Skeleton created");
    }

    public String startEngine(){
        return "Engine was started";
    }

    public String drive(){
        return "Car is being driven";
    }

    protected void runEngine(){
        System.out.println("Engine has run");
    }



}
