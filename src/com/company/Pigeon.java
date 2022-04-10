package com.company;

public class Pigeon extends Bird implements AnimalMove, AnimalBehavior{
    private String speciesShava56415;

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void moveShava56415() {
        System.out.println("Pigeon is flying");
    }

    Pigeon(){
        super();
        speciesShava56415="NN";
    }

    public Pigeon(String nameShava56415, int ageShava56415, int weightShava56415, String featherColorShava56415, String speciesShava56415){
        super(nameShava56415, ageShava56415, weightShava56415,featherColorShava56415);
        this.speciesShava56415= speciesShava56415;
    }

    public Pigeon(int ageShava56415, String featherColorShava56415, String speciesShava56415){
        super(ageShava56415, featherColorShava56415);
        this.speciesShava56415=speciesShava56415;
    }

    public void peckingWoodShava56415(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoiceShava56415() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatShava56415(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciesShava56415() {
        return speciesShava56415;
    }

    public void setSpeciesShava56415(String speciesShava56415) {
        this.speciesShava56415 = speciesShava56415;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "speciesShava56415='" + speciesShava56415 + '\'' +
                '}';
    }
}
