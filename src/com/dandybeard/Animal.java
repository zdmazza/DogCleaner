package com.dandybeard;

public class Animal extends Exception {

    private String name;
    private int age;
    private String sex;

    public Animal(String name, int age, String sex) throws Exception {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex.toLowerCase());
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws Exception {

        if(age < 1) {
            throw new Exception("Your dog's age can't be less than one!");
        }
        this.age = age;
    }

    public void setSex(String sex) throws Exception {
        if(!sex.equals("female") && !sex.equals("male")) {
            throw new Exception("You must choose either Male or Female.");
        }
        this.sex = sex.toLowerCase();
    }
}
