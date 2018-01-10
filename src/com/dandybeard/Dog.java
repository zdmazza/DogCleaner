package com.dandybeard;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, String sex, int age, String breed) throws Exception {
        super(name, age, sex);
        this.breed = breed;
    }

    public String bark() {
        return "Woof! Woof! Woof!";
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public String getSex() {
        return super.getSex();
    }

    public String getPronoun() {
        if(this.getSex().equals("Male")) {
            return "him";
        }
        else {
            return "her";
        }
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
