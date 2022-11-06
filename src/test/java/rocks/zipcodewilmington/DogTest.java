package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setName() {
        //Give
        String expectedDogName = "Ellie";
        Date expectedBirthday = new Date (2022, 4,28);
        Integer expectedId = 4282022;
        //When
        Dog dog = new Dog (expectedDogName, expectedBirthday, expectedId);
        String actual = dog.getName();
        //Then
        Assert.assertEquals(expectedDogName, actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void dogSpeakTest() {
        //Give
        String expectedDogName = "Ellie";
        Date expectedBirthday = new Date (2022, 4,28);
        Integer expectedId = 4282022;
        String expectedSpeak = "bark!";
        //When
        Dog dog = new Dog (expectedDogName, expectedBirthday, expectedId);
        String actual = dog.speak();
        //Then
        Assert.assertEquals(expectedSpeak,actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateDogTest() {
        //Give
        String expectedDogName = "Ellie";
        Date oldBirthday = new Date(2022, 4, 28);
        Date expectedNewBirthday = new Date(2022, 3, 11);
        Integer expectedId = 4282022;
        //When
        Dog dog = new Dog(expectedDogName, oldBirthday, expectedId);
        dog.setBirthDate(expectedNewBirthday);
        Date actual = dog.getBirthDate();
        //Then
        Assert.assertEquals(expectedNewBirthday, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatDogTest() {
        //Give
        String expectedDogName = "Ellie";
        Date expectedBirthday = new Date(2022, 4, 28);
        Integer expectedId = 4282022;
        //When
        Dog dog = new Dog(expectedDogName, expectedBirthday, expectedId);
        Food food = new Food();
        dog.eat(food);
        Integer expectedMeals = dog.getNumberOfMealsEaten();
        Integer actual = dog.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expectedMeals, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void dogIdTest() {
        //Give
        String expectedDogName = "Ellie";
        Date expectedBirthday = new Date(2022, 4, 28);
        Integer expectedId = 4282022;
        //When
        Dog dog = new Dog(expectedDogName, expectedBirthday, expectedId);
        Integer actual = dog.getId();
        //Then
        Assert.assertEquals(expectedId, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        //Give
        String expectedDogName = "Ellie";
        Date expectedBirthday = new Date(2022, 4, 28);
        Integer expectedId = 4282022;
        //When
        Dog dog = new Dog(expectedDogName, expectedBirthday, expectedId);
        //Then
        Assert.assertEquals(dog instanceof Animal, true);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        //Give
        String expectedDogName = "Ellie";
        Date expectedBirthday = new Date(2022, 4, 28);
        Integer expectedId = 4282022;
        //When
        Dog dog = new Dog(expectedDogName, expectedBirthday, expectedId);
        //Then
        Assert.assertEquals(dog instanceof Mammal, true);

    }
}
