package com.company;

public class Fish extends Animal implements AnimalBehavior,AnimalMove{
    private String scaleColorShava56415;

    public Fish(){
        super();
        scaleColorShava56415= "NN";
    }

    public Fish(String nameShava56415, int ageShava56415 , int weightShava56415, String scaleColorShava56415){
        super(nameShava56415, ageShava56415, weightShava56415);
               this.scaleColorShava56415= scaleColorShava56415;
    }

    public Fish(int ageShava56415 , String scaleColorShava56415){
        super(ageShava56415);
        this.scaleColorShava56415=scaleColorShava56415;
    }

    public void drinkWaterShava56415(){
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoiceShava56415() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void moveShava56415() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void eatShava56415(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorShava56415() {
        return scaleColorShava56415;
    }

    public void setScaleColorShava56415(String scaleColorShava56415) {
        this.scaleColorShava56415 = scaleColorShava56415;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorShava56415='" + scaleColorShava56415 + '\'' +
                '}';
    }
}
