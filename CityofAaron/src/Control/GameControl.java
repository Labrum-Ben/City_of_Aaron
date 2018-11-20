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
        
        theGame.setMap(theMap);

// create and initialize a CropData object
// save a reference to it in the Game object
        CropData cropData = new CropData();
        
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setAcresPlanted(1000); 
        
        game.setCropData(cropData); 
        
        // when all is done, save a reference to the Game object
        CityofAaron.setGame(game);

        
   
  }     
  
  public class createCropDataObject{
      // method prologue ….
    public static void createCropDataObject()
    {
        CropData theCrops = new CropData();
        
        theCrops.setYears(0);
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
        
        theGame.setCropData(theCrops);         
    }
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
 String farmland = "\nYou are on the fertile banks of the River." +
 "\nIn the spring this low farmland floods and is covered with rich" +
 "\nnew soil. Wheat is planted as far as you can see."; 

 // set a farmland location with a hint
 loc = new Location();
 loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
 loc.setSymbol("!!!");
 theMap.setLocation(3, 3, loc);
 
  // define the string for a wilderness land location
 String wilderness = "\nYou are lost in the wilderness." +
 "\nLions and Tigers and Bears... Oh My!" +
 "\nTurn back now."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(wilderness + "\nIf your keys fall into a vat of boiling lava don't reach in after them.");
 loc.setSymbol("---");
 theMap.setLocation(0, 5, loc);

 
   // define the string for a wilderness land location
 String ocean = "\nYou can smell the fresh air of the Ocean." +
 "\nYou can feel the sand between your toes." +
 "\nThing-a-ma-bobs, I got twenty of them."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(ocean + "\nBroken promises don't upset me. I just think, why did they believe me?");
 loc.setSymbol("@@@");
 theMap.setLocation(0, 1, loc);
 
    // define the string for a wilderness land location
 String valley = "\nThis looks like a peaceful place to take a nap." +
 "\nThe valley lays between two mountain regions west of the village." +
 "\nYou can almost see the temple from here."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(ocean + "\nThis is a flat area between the mountains.");
 loc.setSymbol("^_^");
 theMap.setLocation(2, 2, loc);
 
    // define the string for a wilderness land location
 String mountains = "\nYou can see the entire valley from here." +
 "\nThe village is to your right and the ocean to your left." +
 "\nThe Valley is between two mountian ranges, and the Temple can be found here."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(mountains + "\nTo me, boxing is like a ballet, except there's no music, no choreography, and the dancers hit each other.");
 loc.setSymbol("^^^");
 theMap.setLocation(1, 2, loc);
 theMap.setLocation(3, 2, loc);
 
    // define the string for a wilderness land location
 String temple = "\nThe Ocean is to your west and the fields to your east." +
 "\nThere is a mountain range north of you." +
 "\nThe desert is south of your location."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(mountains + "\nTo me, boxing is like a ballet, except there's no music, no choreography, and the dancers hit each other.");
 loc.setSymbol("***");
 theMap.setLocation(4, 2, loc);
 
     // define the string for a wilderness land location
 String desert = "\nYou are as far south as you can go." +
 "\nIs that water in the distance to the west?." +
 "\nThere are more fields to the east."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(mountains + "\nIt is very dry and not much can grow here.");
 loc.setSymbol(">>>");
 theMap.setLocation(5, 2, loc);
 
     // define the string for a wilderness land location
 String village = "\nThe mountains can block your view to the west." +
 "\nYou can hear the soothing sounds of the river from the east." +
 "\nThere is farmland south of here."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(village + "\nThis is it y'all.");
 loc.setSymbol("$$$");
 theMap.setLocation(3, 1, loc);
 theMap.setLocation(3, 2, loc);
 
      // define the string for a wilderness land location
 String field = "\nThe river floods from the east." +
 "\nThe farmland is north from here." +
 "\nyou are as far south as you can go."; 

  // set a wilderness location with a hint
 loc = new Location();
 loc.setDescription(field + "\nThis is where we grow our food.");
 loc.setSymbol("???");
 theMap.setLocation(3, 4, loc);
 theMap.setLocation(3, 5, loc);
 
}

