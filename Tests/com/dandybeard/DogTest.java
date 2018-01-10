package com.dandybeard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class DogTest {

    public Dog dog;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        dog = new Dog("Momo", "male", 1, "Boston Terrier");
    }

    @Test(expected = Exception.class)
    public void settingAgeOfDogLessThanOneReturnsError() throws Exception{
        dog = new Dog("Momo", "male", -1, "Boston Terrier");

        thrown.expect(Exception.class);
        thrown.expectMessage("Your dog's age can't be less than one!");
    }

    @Test
    public void dogsNameShouldBeAlphaCharactersOnly() {
        dog.setName("Momo");
        Assert.assertEquals(true, dog.getName().matches("[a-zA-Z]+"));
    }

    @Test
    public void dogsBreedShouldNotContainNumbers() {
        dog.setBreed("123");
        Assert.assertEquals(false, dog.getBreed().matches("[a-zA-Z]+"));
    }

    @Test
    public void dogsSexShouldBeMaleOrFemaleOnly() throws Exception {
        dog.setSex("male");
        Assert.assertEquals("Male", "male", dog.getSex());
        dog.setSex("female");
        Assert.assertEquals("Female", "female", dog.getSex());
    }


}