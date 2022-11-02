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

    @Test
    public void toCheckUpperCaseFailure()
    {
        //arrange
        String cityName="Bern";
        String expectedResult ="Bern";
        //act
        String actualResult= sortingCities.convertToUpperCase(cityName);
        //assert
        assertEquals(expectedResult,actualResult);
    }
    //write all the test cases here

    @Test
    public void toCheckCityAwayFromZurich52Km()
    {//arrange
        String[] cityName = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };

        int[] cityDistanceInKm = {138,52,118,136,85,276,103,87,214,101};
        String expectedResult="Lucerne";
        //act
        String actualResult=sortingCities.findTheCityDistanceFromZurich52(cityName,cityDistanceInKm);
        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void toCheckCityAwayFromZurich52Failure()
    {
        String[] cityName = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };

        int[] cityDistanceInKm = {138,52,118,136,85,276,103,87,214,101};
        String expectedResult="Bern";
        //act
        String actualResult=sortingCities.findTheCityDistanceFromZurich52(cityName,cityDistanceInKm);
        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void toCheckSortedArray()
    {
        //arrange
        String[] cityName = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };
        int[] cityDistanceInKm = {138,52,118,136,85,276,103,87,214,101};
        int[] expectedResult={52,85,87,101,103,118,136,138,214,276};
        //act
        int[] actualResult=sortingCities.sortedDistanceInKm(cityName,cityDistanceInKm);
        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void toCheckWayFromZurichGreaterAndEqualTo270Failure()
    {
        String[] cityName = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };
        int[] cityDistanceInKm = {138,52,118,136,85,276,103,87,214,101};
        String expectedResult="Bern";
        //act
        String actualResult=sortingCities.findTheCitiesFromZurichMoreThanAndEqualTo270(cityName,cityDistanceInKm);
        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void wayFromZurichGreaterAndEqualTo270()
    {
        //arrange
        {String[] cityName = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };
            int[] cityDistanceInKm = {138,52,118,136,85,276,103,87,214,101};
            String expectedResult="Geneva";
         //act
            String actualResult=sortingCities.findTheCitiesFromZurichMoreThanAndEqualTo270(cityName,cityDistanceInKm);
            //assert
            assertEquals(expectedResult,actualResult);
    }


}
}