package com.jap;

/**
 * Hello world!
 *
 */
public class SortingCities {
    public static void main(String[] args) {
        String[] cityName = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };

        int[] cityDistanceInKm={138,52,118,136,85,276,103,87,214,101};
        SortingCities sortingCities = new SortingCities();


        System.out.println("The city Name in Upper Case : ");
        for (int index = 0; index < cityName.length; index++) {

            String upperCaseCityName = sortingCities.convertToUpperCase(cityName[index]);
            System.out.print(" " + upperCaseCityName + ",");
        }

        String cityNameDistanceFromZurich = sortingCities.findTheCityDistanceFromZurich52(cityName, cityDistanceInKm);
        System.out.println();
        System.out.println("The City Which Is 52 From Zurich is : " + cityNameDistanceFromZurich);


        String theCitiesFromZurichMoreThanAndEqualTo270 = sortingCities.findTheCitiesFromZurichMoreThanAndEqualTo270(cityName, cityDistanceInKm);
        System.out.println("The cities which are greater than and equal to 270 km fromZurich is :" + theCitiesFromZurichMoreThanAndEqualTo270);


        int[] sortedDistanceInKm = sortingCities.sortedDistanceInKm(cityName, cityDistanceInKm);
        System.out.println("sorted list in Km : ");
        for (int index = 0; index <sortedDistanceInKm.length ; index++) {
            System.out.println(sortedDistanceInKm[index]+" KM  -- "+cityName[index]);

        }
    }

    /**
     * This Method is used to change names in Upper case
     *
     * @param name-string variable
     * @return string-in upper case
     */
    public String convertToUpperCase(String name) {
        String upperCaseName = name.toUpperCase();
        return upperCaseName;
    }

    public String findTheCityDistanceFromZurich52(String[] cityName, int[] cityDistanceInKm) {
        for (int index = 0; index < cityName.length; index++) {
            if (cityDistanceInKm[index]==52) // cityDistanceInKM[index] == 52
            {
                return cityName[index];
            }
        }
        return "";
    }

    public String findTheCitiesFromZurichMoreThanAndEqualTo270(String[] cityName, int[] cityDistanceInKm) {
        for (int index = 0; index < cityName.length; index++) {
            if (cityDistanceInKm[index]>=270) {
                return cityName[index];
            }
        }
        return"";
    }
    public int[] sortedDistanceInKm(String[] cityName,int[] cityDistanceInKm)
    {
        for (int pass = 1; pass <cityDistanceInKm.length ; pass++)
        {
            for ( int index = 0; index < cityDistanceInKm.length-1 ; index++)
            {
                 if(cityDistanceInKm[index]>cityDistanceInKm[index+1])
                 {
                     int temp=cityDistanceInKm[index];
                     cityDistanceInKm[index]=cityDistanceInKm[index+1];
                     cityDistanceInKm[index+1]=temp;

                     String temp1=cityName[index];
                     cityName[index]=cityName[index+1];
                     cityName[index+1]=temp1;
                 }
            }
        }
        return cityDistanceInKm;
    }
}
