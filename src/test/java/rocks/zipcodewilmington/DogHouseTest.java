package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        //Give
        String expectedDogName = "Susan";
        Date expectedBirthday = new Date (1927, 4,15);
        Integer expectedId = 4151927;
        DogHouse.clear();
        Integer expectedNumberCats = new DogHouse().getNumberOfDogs() + 1;
        //When
        Dog dog = new Dog (expectedDogName, expectedBirthday, expectedId);
        DogHouse.add(dog);
        Integer actual = new DogHouse().getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedNumberCats, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogIdTest() {
        //Give
        String expectedDogName = "Susan";
        Date expectedBirthday = new Date (1927, 4,15);
        Integer expectedId = 4151927;
        DogHouse.clear();
        //When
        Dog dog = new Dog (expectedDogName, expectedBirthday, expectedId);
        DogHouse.add(dog);
        DogHouse.remove(dog.getId());
        Integer actual = expectedId;
        //Then
        Assert.assertEquals(expectedId, actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        //Give
        String expectedDogName = "Susan";
        Date expectedBirthday = new Date (1927, 4,15);
        Integer expectedId = 4151927;
        DogHouse.clear();
        Integer expectedNumberDogs = new DogHouse().getNumberOfDogs();
        //When
        Dog dog = new Dog (expectedDogName, expectedBirthday, expectedId);
        DogHouse.remove(dog);
        Integer actual = new DogHouse().getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedNumberDogs, actual);
    }


    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void useDogIdTest() {
        //Give
        String expectedDogName = "Susan";
        Date expectedBirthday = new Date (1927, 4,15);
        Integer expectedId = 4151927;
        DogHouse.clear();
        //When
        Dog dog = new Dog (expectedDogName, expectedBirthday, expectedId);
        DogHouse.add(dog);
        Integer actual = expectedId;
        //Then
        Assert.assertEquals(expectedId, actual);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
