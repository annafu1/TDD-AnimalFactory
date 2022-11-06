package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        //Give
        String expectedCatName = "Winston";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        CatHouse.clear();
        Integer expectedNumberCats = new CatHouse().getNumberOfCats() + 1;
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        CatHouse.add(cat);
        Integer actual = new CatHouse().getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNumberCats, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatIdTest() {
        //Give
        String expectedCatName = "Winston";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        CatHouse.clear();
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        CatHouse.add(cat);
        CatHouse.remove(cat.getId());
        Integer actual = expectedId;
        //Then
        Assert.assertEquals(expectedId, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        //Give
        String expectedCatName = "Winston";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        CatHouse.clear();
        Integer expectedNumberCats = new CatHouse().getNumberOfCats();
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        CatHouse.remove(cat);
        Integer actual = new CatHouse().getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNumberCats, actual);
    }


    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void useCatIdTest() {
        //Give
        String expectedCatName = "Winston";
        Date expectedBirthday = new Date (1995, 5,24);
        Integer expectedId = 5241995;
        CatHouse.clear();
        //When
        Cat cat = new Cat (expectedCatName, expectedBirthday, expectedId);
        CatHouse.add(cat);
        Integer actual = expectedId;
        //Then
        Assert.assertEquals(expectedId, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void numberOfCatsTest() {
        //Given
        String CatName = "Chip";
        Date expectedBirthday = new Date();
        Cat animal = AnimalFactory.createCat(CatName, expectedBirthday);
        CatHouse.clear();
        //When
        CatHouse.add(animal);
        //Then
        CatHouse.getNumberOfCats();

    }
}
