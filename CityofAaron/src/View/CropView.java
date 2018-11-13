// The CropViewView class - part of the view layer
// Object of this class manages the crop view
// Author: Ben Labrum, Adrienne Groll, Gavin Siegel team
// Date last modified: 11/7/2018
//-------------------------------------------------------------
package View;

import Model.*;
import Control.*;
import java.util.Scanner;
import cityofaaron.CityofAaron;

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
     int price = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",price);
     System.out.print("\nHow many acres of land do you wish to buy? "); 

    //  Get the user’s input and save it.
    int toBuy;
    toBuy = keyboard.nextInt();

    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.buyLand(price, toBuy, cropData);

     // output how much land we now own
     System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
}

    
}

