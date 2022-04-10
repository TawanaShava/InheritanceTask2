package com.company;

public class Mammal extends Animal implements AnimalMove,AnimalName {

    private String orderShava56415;

    public Mammal(){
        super();
        orderShava56415 = "NN";
    }

    public Mammal(String nameShava56415, int ageShava56415 , int weightShava56415, String orderShava56415){
        super(nameShava56415, ageShava56415, weightShava56415);
        this.orderShava56415=orderShava56415;
    }

    public Mammal(int ageShava56415 , String orderShava56415){
        super(ageShava56415);
        this.orderShava56415=orderShava56415;
    }

    @Override
    public void moveShava56415() {
        System.out.println("Mammal is moving ");
    }

    public void drinkMilkShava56415(){
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoiceShava56415() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eatShava56415(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrderShava56415() {
        return orderShava56415;
    }

    public void setOrderShava56415(String orderShava56415) {
        this.orderShava56415 = orderShava56415;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "orderShava56415='" + orderShava56415 + '\'' +
                '}';
    }
}
