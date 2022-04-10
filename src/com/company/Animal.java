package com.company;

abstract class Animal implements AnimalMove ,AnimalName{
    private String nameShava56415;
    private int ageShava56415;
    private int weightShava56415;

    public Animal(){
        ageShava56415 = weightShava56415 = 10;
        nameShava56415 = "NN";
    }

    public Animal(String nameShava56415 ,int ageShava56415 , int weightShava56415){
        this.nameShava56415 = nameShava56415;
        this.ageShava56415= ageShava56415;
        this.weightShava56415= weightShava56415;
    }

    public Animal(int ageShava56415){
        this.ageShava56415=ageShava56415;
    }

    public abstract void eatShava56415(String FoodName);

    public abstract void moveShava56415();

    public abstract void getVoiceShava56415();

    public String getNameShava56415() {
        return nameShava56415;
    }

    public void setNameShava56415(String nameShava56415) {
        this.nameShava56415 = nameShava56415;
    }

    public int getAgeShava56415() {
        return ageShava56415;
    }

    public void setAgeShava56415(int ageShava56415) {
        this.ageShava56415 = ageShava56415;
    }

    public int getWeightShava56415() {
        return weightShava56415;
    }

    public void setWeightShava56415(int weightShava56415) {
        this.weightShava56415 = weightShava56415;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameShava56415='" + nameShava56415 + '\'' +
                '}';
    }
}






