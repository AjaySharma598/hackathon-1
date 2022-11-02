package com.jap;

/**
 * Hello world!
 *
 */
public class SortingCities
{
    public static void main( String[] args )
    {
        String []cityName={"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };
        int[] cityDistance={ 138, 52 , 118 , 136 ,85 ,276 ,103 ,87 ,214 ,101};
        SortingCities sortingCities=new SortingCities();
        System.out.println("The city Name in Upper Case : ");
        for (int index = 0; index <cityName.length ; index++) {

            String upperCaseCityName=sortingCities.convertToUpperCase(cityName[index]);
            System.out.print( " " +upperCaseCityName +",");
        }

           String cityNameDistanceFromZurich= sortingCities.findTheCityDistanceFromZurich52(cityDistance);

        System.out.println("The City Which Is 52 From Zurich is : "+cityNameDistanceFromZurich);
    }
    public String convertToUpperCase(String name) {
        String upperCaseName = name.toUpperCase();
        return upperCaseName;
    }
    public String findTheCityDistanceFromZurich52(int[] cityDistance)
    {



        return "";
    }
}