package Control;

/*
 * The CityofAaron file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */


import model.CropData;
import java.util.Random;

        
/**
 *
 * @author theag
 */
public class CropControl
{
 private static Random random = new Random();


/**
* The buyLand method
* Purpose: To buy land
* param the number of acres to buy
* param verify that there is enough wheatInStore for purchase
* param a reference to a CropData object
* return the number of acres left after the sale
* Pre-conditions: acres to buy must be positive
* and <= the number of acres owned
*/    
public static int buyLand(int landPrice, int acresToBuy, CropData thedata)
{
   
        //if acresToBuy < 0, return -1
    if(acresToBuy<0)
        return-1;
    
    int wheatInStore = thedata.getWheatInStore();
    //if (acresToBuy * landPrice) > wheat inStore, return -1
    if ((acresToBuy * landPrice) > wheatInStore)
            return -1;
 
    int owned = thedata.getAcresOwned();
    //acresOwned = acresOwned + acresToBuy
    owned += acresToBuy;
    thedata.setAcresOwned(owned);
    
    //wheatInStore = wheatInStore - (acresToBuy * landPrice)
    int wheat = thedata.getWheatInStore();
    wheat-= (acresToBuy * landPrice);
    thedata.setWheatInStore(wheat);

    
   //return acresOwned
    return owned;


}
    /*ADRIENNE*/

    public static int setOffering(int setOffering, CropData thedata) 
    {
        //if setOffering < 0, return-1
        if (setOffering < 0)
            return -1;
        
        //if setOffering > 100, return -1
        if (setOffering > 100)
            return -1;

        //store setOffering
        return setOffering;
    }

 /*Ben*/   
    public static int feedPeople(int setWheatForFood, int setWheatInStore, int setpopulation, CropData thedata)
    
    {
        if (setWheatInStore < 0)
             return -1;

        if (setWheatForFood > setWheatInStore)
            return -1;

        return setWheatInStore;
    } 
    
    /* Gavin*/
    // The plantCrops method.
    // Purpose: plant the crops.
    // Parameters: the number of acres of land that the player wants to plant.
    // Returns: must return a positive number. Returns the remaining number
    // of wheat in store. If there's an error, an exception is throw.
    // Pre-conditions: number of wheat in store and acres must be enough for 
    // user to plant the crops.
    public int plantCrops(int acresToPlant, int acresOwned, int wheatInStore, CropData cropData)
    {
        int acreOwned = cropData.getAcresOwned();
        if (acresToPlant > acresOwned) 
            return -1;

        int wheatOwned = cropData.getWheatInStore();
        if (acresToPlant * 2 > wheatInStore) 
            return -1;

        return acresOwned;
        }
    
    


    }    


