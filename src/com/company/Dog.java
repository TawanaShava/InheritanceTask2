package com.company;

public class Dog extends Mammal implements AnimalBehavior,AnimalMove{
    private String breedShava56415;

    Dog(){
        super();
        breedShava56415= "NN";
    }

    public Dog(String nameShava56415 , int ageShava56415,int weightShava56415,String rzadShava56415, String breedShava56415){
        super(nameShava56415,ageShava56415,weightShava56415,rzadShava56415);
        this.breedShava56415=breedShava56415;
    }

    public Dog(int ageShava56415, String rzadShava56415, String breedShava56415){
        super(ageShava56415,rzadShava56415);
        this.breedShava56415=breedShava56415;
    }

    public void sportShava56415(){
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilkShava56415() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoiceShava56415() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatShava56415(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    @Override
    public void moveShava56415() {
        System.out.println("Dog is running");
    }

    public String getBreedShava56415() {
        return breedShava56415;
    }

    public void setBreedShava56415(String breedShava56415) {
        this.breedShava56415 = breedShava56415;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedShava56415='" + breedShava56415 + '\'' +
                '}';
    }
}
