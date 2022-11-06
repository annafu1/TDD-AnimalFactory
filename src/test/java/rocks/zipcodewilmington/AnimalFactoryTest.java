package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import java.util.Date;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        //Give
        Dog dog = AnimalFactory.createDog("Ellie", new Date(2002, 4, 28));
        String expectedDogName = "Ellie";
        Date expectedBirthday = new Date(2022, 4, 28);
        //When
        String actualDogName = dog.getName();
        Date actualDogBirthday = new Date(2022, 4, 28);
        //Then
        Assert.assertEquals(expectedDogName, actualDogName);
        Assert.assertEquals(expectedBirthday, actualDogBirthday);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        //Give
        Cat cat = AnimalFactory.createCat("Ajax", new Date(2013, 10, 2));
        String expectedCatName = "Ajax";
        Date expectedBirthday = new Date(2013, 10, 2);
        //When
        String actualCatName = cat.getName();
        Date actualCatBirthday = cat.getBirthDate();
        //Then
        Assert.assertEquals(expectedCatName, actualCatName);
        Assert.assertEquals(expectedBirthday, actualCatBirthday);
    }
}
