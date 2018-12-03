package Control;

/*
 * The CityofAaron file for the CityofAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */


import Exceptions.CropException;
import Model.CropData;
import java.util.Random;

        
/**
 *
 * @author theag
 */
public class CropControl
{
    
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 10;

private static Random random = new Random();
 

 public static int calcLandCost( ) {
 int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
 return landPrice;
}

/**
* The buyLand method
* Purpose: To buy land
* param the number of acres to buy
* param verify that there is enough wheatInStore for purchase
* param a reference to a CropData object
* return the number of acres left after the sale
* Pre-conditions: acres to buy must be positive
* and <= the number of acres owned
     * @param landPrice
     * @param acresToBuy
     * @param thedata
     * @throws Exceptions.CropException
*/    
public static void buyLand(int landPrice, int acresToBuy, CropData thedata) throws CropException
{
   
        //if acresToBuy < 0, return -1
    if(acresToBuy<0)
        throw new CropException("Please enter a positive numbers");
    
    int wheatInStore = thedata.getWheatInStore();
    //if (acresToBuy * landPrice) > wheat inStore, return -1
    if (wheatInStore < acresToBuy * landPrice)
         throw new CropException("There is insufficient wheat to buy this much land");
 
    int owned = thedata.getAcresOwned();
    //acresOwned = acresOwned + acresToBuy
    owned += acresToBuy;
    thedata.setAcresOwned(owned);
    
    //wheatInStore = wheatInStore - (acresToBuy * landPrice)
    wheatInStore = thedata.getWheatInStore();
    wheatInStore-= (acresToBuy * landPrice);
    thedata.setWheatInStore(wheatInStore);

    



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
  
    public static void feedPeople(int setWheatForFood, int setWheatInStore, CropData thedata) throws CropException
    
    {
    int wheatInStore = thedata.getWheatInStore();    
        if (setWheatInStore < 0)
            throw new CropException("There is no wheat!");

    int forFood = thedata.getFeedPeople();
        if (setWheatForFood > setWheatInStore)
            throw new CropException("There is not enough wheat");

    wheatInStore = thedata.getWheatInStore();
    
    }
    
    /* Gavin--Original plantCrops() method & Adrienne--CropException*/ 
    // The plantCrops method.
    // Purpose: plant the crops.
    // Parameters: the number of acres of land that the player wants to plant.
    // Returns: must return a positive number. Returns the remaining number
    // of wheat in store. If there's an error, an exception is throw.
    // Pre-conditions: number of wheat in store and acres must be enough for 
    // user to plant the crops.
    public static void plantCrops(int acresToPlant, CropData cropData) throws CropException
    {
        int acreOwned = cropData.getAcresOwned();
        if (acresToPlant > acreOwned) 
            throw new CropException("You do not own this much land.");

        int wheatOwned = cropData.getWheatInStore();
        if (acresToPlant * 2 > wheatOwned) 
            throw new CropException("There is insufficient wheat to buy this much land");

        
        }

// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, and a 
// reference to a CropData object
// Returns: the acres owned after the sale
// Pre-conditions: acres to sell must be positive
// and <= acresOwned
    public static int sellLand(int landPrice, int acresToSell, CropData cropData) throws CropException {
        //if acresToSell < 0, return -1
        if (acresToSell < 0) {
            throw new CropException("Unofrtunetly, you do not own any land at this momment. Please buy some and then try to sell later.");
        }

        //if acresToSell > acresOwned, return -1
        int owned = cropData.getAcresOwned();
        if (acresToSell > owned) {
            throw new CropException("You are trying to sell more land than you currentlu have,only banks exhibit this type of behaviour. Please insert smaller number");

        }

        //acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setAcresOwned(owned);

        //wheatInStore = wheatInStore + acresToSell * landPrice
        int wheat = cropData.getWheatInStore();
        wheat *= (acresToSell * landPrice);

        cropData.setWheatInStore(wheat);

        //return acresOwned
        return owned;
}

    

    }    


