package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setName() {
        //Give
        String expectedCatName = "Periwinkle";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        String actual = cat.getName();
        //Then
        Assert.assertEquals(expectedCatName, actual);

    }

    // TODO - Create tests for `speak`
    @Test
    public void catSpeakTest() {
        //Give
        String expectedCatName = "Periwinkle";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        String expectedSpeak = "meow!";
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        String actual = cat.speak();
        //Then
        Assert.assertEquals(expectedSpeak,actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateCatTest() {
        //Give
        String expectedCatName = "Periwinkle";
        Date oldBirthday = new Date (1995, 5,24);
        Date expectedNewBirthday = new Date (1995, 4, 25);
        Integer expectedId = 5241995;
        //When
        Cat cat = new Cat (expectedCatName, oldBirthday, expectedId);
        cat.setBirthDate(expectedNewBirthday);
        Date actual = cat.getBirthDate();
        //Then
        Assert.assertEquals(expectedNewBirthday,actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatCatTest() {
        //Give
        String expectedCatName = "Periwinkle";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        Food kibbles = new Food();
        cat.eat(kibbles);
        Integer expectedMeals = cat.getNumberOfMealsEaten();
        Integer actual = cat.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expectedMeals,actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void catIdTest() {
        //Give
        String expectedCatName = "Periwinkle";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        Integer actual = cat.getId();
        //Then
        Assert.assertEquals(expectedId,actual);
    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        //Give
        String expectedCatName = "Periwinkle";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        //Then
        Assert.assertEquals(cat instanceof Animal, true);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        //Give
        String expectedCatName = "Periwinkle";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        //Then
        Assert.assertEquals(cat instanceof Mammal, true);
    }
}
