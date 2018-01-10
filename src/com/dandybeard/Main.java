package com.dandybeard;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class Main {

    public static void main(String[] args) {
        Dog dog;
        DogCleaner dogCleaner;
        try {
            dog = new Dog("Momo", "Male", 1, "Boston Terrier");
            dogCleaner = new DogCleaner(dog);
            dogCleaner.dirty();
            dogCleaner.clean();
            dogCleaner.shake();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            dog = new Dog("Mimi", "female", 1, "Jack Russell");
            dogCleaner = new DogCleaner(dog);

            dogCleaner.dirty();
            dogCleaner.clean();
            dogCleaner.shake();
        }
        catch(Exception e) {
                System.out.println(e.getMessage());
            }
    }
}
