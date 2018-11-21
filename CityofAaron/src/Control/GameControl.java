/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.*;
import CityofAaron.CityofAaron;

/**
 *
 * @author theag
 */
public class GameControl {
    
    // size of the Locations array
private static final int MAX_ROW = 5;
private static final int MAX_COL = 5;
    
public static void createNewGame(String _name)  
  {
       // create the game object
        Game game = new Game();
        
        // create the player object and set the name
        Player player = new Player();
        player.setName(_name);
        
        // save reference to the player object in the game
        game.setPlayer(player);

        // create the map
        createMap();

        // create the crop data object
        createCropDataObject();
   }
        
      // method prologue ….
    public static void createCropDataObject()
    {
        CropData theCrops = new CropData();
        
        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
        theCrops.setAcresPlanted(1000); 
        
        game.setCropData(theCrops);         
    }
  

    // The createMap method
    // Purpose: creates the location objects and the map
    // Parameters: none
    // Returns: none
    public static void createMap()   
    {
    // create the Map object, it is 5 x 5
    // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        // create a string that will go in the Location objects
        // that contain the river
        String river = "\nYou are on the River. The river is the source" +
                      "\nof life for our city. The river marks the eastern " +
                      "\nboundary of the city - it is wilderness to the East.";
        

// create a new Location object
Location loc = new Location();
// use setters in the Location class to set the description and symbol
loc.setDescription(river);
loc.setSymbol("~~~");  

// set this location object in each cell of the array in column 4      
for(int i = 0; i < MAX_ROW; i++)
 {
        theMap.setLocation(i, 4, loc);
 }

 // define the string for a farm land location
 String wheatfield = "\nYou are on the fertile banks of the River." +
 "\nIn the spring this low wheayfeilds flood and is covered with rich" +
 "\nnew soil. Wheat is planted as far as you can see."; 

 // set a wheatfield location with a hint
 loc = new Location();
 loc.setDescription(wheatfield + "\nOne bushel will plant two acres of wheat.");
 loc.setSymbol("!!!");
 theMap.setLocation(3, 3, loc);
 theMap.setLocation(4, 3, loc);
 theMap.setLocation(5, 3, loc);
 
  // define the string for a lamaniteBorder land location
 String lamaniteBorder = "\nYou are headed to the border of the Lamanites land." +
 "\nLions and Tigers and Bears... Oh My!" +
 "\nTurn back now."; 

  // set a lamaniteBorder location with a hint
 loc = new Location();
 loc.setDescription(lamaniteBorder + "\nIf your keys fall into a vat of boiling lava don't reach in after them.");
 loc.setSymbol("---");
 theMap.setLocation(0, 5, loc);

 
   // define the string for a desert land location
 String desert = "\nYou are as far west as you can go." +
 "\nThe City's Granary and the Ruler's Court are to the east." +
 "\nThere is also undeveloped land to the east."; 

  // set a desert location with a hint
 loc = new Location();
 loc.setDescription(desert + "\nBroken promises don't upset me. I just think, why did they believe me?");
 loc.setSymbol("@@@");
 theMap.setLocation(0, 1, loc);
 
    // define the string for a wilderness land location
 String rulersCourt = "\nThis is where the rulers come to court." +
 "\nthe desert is west of here." +
 "\nThe village is east from here."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(rulersCourt + "\nThis is where the rulers are.");
 loc.setSymbol("^_^");
 theMap.setLocation(2, 2, loc);
 
    // define the string for a wilderness land location
 String undevelopedLand = "\nYou can see the desert from here." +
 "\nThe wheat fields is to your right and the desert to your left." +
 "\nThe land is undeveloped."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(undevelopedLand + "\n.There is nothing here.");
 loc.setSymbol("^^^");
 theMap.setLocation(3, 2, loc);
 theMap.setLocation(4, 2, loc);
 theMap.setLocation(5, 2, loc);
 
    // define the string for a wilderness land location
 String granaryStorehouse = "\nThe village is to the east." +
 "\nThere is a ruler's court south of you." +
 "\nThe desert is west of your location."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(granaryStorehouse + "\nThis is where we store our grains.");
 loc.setSymbol("***");
 theMap.setLocation(1, 2, loc);
 
     
 
     // define the string for a wilderness land location
 String village = "\nThe mountains can block your view to the west." +
 "\nYou can hear the soothing sounds of the river from the east." +
 "\nThere is farmland south of here."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(village + "\nThis is it y'all.");
 loc.setSymbol("$$$");
 theMap.setLocation(1, 3, loc);
 theMap.setLocation(2, 3, loc);
 

 
 game.setMap(theMap);
 
}
}

