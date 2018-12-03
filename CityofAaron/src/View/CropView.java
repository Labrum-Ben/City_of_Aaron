// The CropViewView class - part of the view layer
// Object of this class manages the crop view
// Author: Ben Labrum, Adrienne Groll, Gavin Siegel team
// Date last modified: 11/7/2018
//-------------------------------------------------------------
package View;

import Model.*;
import java.util.Scanner;
import cityofaaron.CityofAaron;
import Model.CropData;
import Control.CropControl;
import Exceptions.CropException;

/**
 *
 * ADRIENNE GROLL
 */

public class CropView {
 // Create a Scanner object
 private static Scanner keyboard = new Scanner(System.in);   
     
 // Get references to the Game object and the CropData object
 static private Game game = CityofAaron.getGame();
 static private CropData cropData = game.getCropData();

 // The runCropView method()
// Purpose: runs the methods to manage the crops game
// Parameters: none
// Returns: none
public static void runCropView()
{
    // call the buyLandView( ) method
    buyLandView( );

    // add calls to the other crop view methods
    // as they are written
    setOfferingView( );
    //setfeedPeopleView();
    plantCropsView();
    
    
}

    
    //ADRIENNE GROLL//
    //The setOfferingView method
    // Purpose: The method to allocate a percentage of the harvest to be paid as an offering
    // Parameters: none
    // Returns: none
    //Stores: setOffering in the CropData object
    
    public static void setOfferingView() 
    {

    
        System.out.println("\nWhat percentage of the harvest do you want to pay as an offering?");
   
        //  Get the user’s input and save it.
        int offering = keyboard.nextInt(); 

        
        CropControl.setOffering(offering, cropData);
            } 
    
    // The buyLandView method
    // Purpose: interface with the user input for buying land
    // Parameters: none
    // Returns: none
    public static void buyLandView() {
        // Get the cost of land for this round.
     int landPrice = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",landPrice);
   

    //  Get the user’s input and save it.
    int acresToBuy;  
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
       System.out.print("\nHow many acres of land do you wish to buy? ");  
       acresToBuy = keyboard.nextInt();
       try
       {
            CropControl.buyLand(landPrice, acresToBuy, cropData);
        }
        catch(CropException e)
        {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
        }
} while(paramsNotOkay);




     // output how much land we now own
     System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
}
//Adrienne
    // The plantCrops method
    // Purpose: interface with the user input for planting crops
    // Parameters: none
    // Returns: none
    public static void plantCropsView() {
     
        int acresOwned = cropData.getAcresOwned();

     // Prompt the user to enter the number of crops to plant
     System.out.format("There is %d of wheat in store.%n", acresOwned);


    //  Get the user’s input and save it.
    int acresToPlant;  
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
       System.out.print("\nHow many acres of land do you wish to plant? ");  
       acresToPlant = keyboard.nextInt();
       try
       {
        CropControl.plantCrops(acresToPlant, cropData);
        }
        catch(CropException e)
        {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
        }
} while(paramsNotOkay);
    
    }
    //Ben
    //FeedPeople method
    
    public static void feedPeopleView(){

    //Food in the Store
        int wheatInStore = cropData.getWheatInStore();
        
    //Prompt for food needed    
    System.out.format("There is %d of wheat in store.%n", wheatInStore);
    System.out.println("/nHow much food do you need to feed the people");
        
        //Get user input
        int feedPeople;
        boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.println("/nHow much food do you need to feed the people");
        feedPeople = keyboard.nextInt();
 
        try
        {
        CropControl.feedPeople(wheatInStore,feedPeople, cropData);  
        }
        catch(CropException e)
        {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
        }
} while(paramsNotOkay);    
       

}     
    
    // Gavin
    public static void sellLandView() {
        // Get the cost of land for this round.
     int landPrice = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",landPrice);
     System.out.print("\nHow many acres of land do you wish to sell? "); 

    //  Get the user’s input and save it.
    int acresToSell;  
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
       System.out.print("\nHow many acres of land do you wish to sell? ");  
       acresToSell = keyboard.nextInt();
       try
       {
            CropControl.sellLand(landPrice, acresToSell, cropData);
        }
        catch(CropException e)
        {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
        }
} while(paramsNotOkay);
    }

}
