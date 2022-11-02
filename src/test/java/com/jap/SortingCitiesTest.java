package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingCitiesTest {

    SortingCities sortingCities;

    @Before
    public void setUp()  {
        sortingCities=new SortingCities();
    }

    @After
    public void tearDown()  {
        sortingCities=null;
    }


    @Test
    public void toCheckUpperCase()
    {
        //arrange
        String cityName="Bern";
        String expectedResult ="BERN";
        //act
        String actualResult= sortingCities.convertToUpperCase(cityName);
        //assert
        assertEquals(expectedResult,actualResult);
    }

    //write all the test cases here
}