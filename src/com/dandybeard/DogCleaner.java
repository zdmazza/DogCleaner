
package com.dandybeard;

public class DogCleaner implements DogInterface {

    private Dog dog;

    public DogCleaner(Dog dog) {
        this.dog = dog;
    }

    public void clean() {
        System.out.printf("%s's %s booty is so clean it's squeaky!%n", dog.getName(), dog.getBreed());
    }

    public void shake() {
        System.out.printf("He likes to shake it off, shake it off!%n");
    }

    public void dirty() {
        System.out.printf("Dirty %s? Clean %s up!%n", dog.getBreed(), dog.getPronoun());
    }


}
