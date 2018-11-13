/*
 * The CityofAaron file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */


package Model;

/**
 *
 * @author theag
 */
import java.io.Serializable;



public class Game implements Serializable {
   
    private Player thePlayer;
    private CropData cropData;
    private int animals;
    private int tools;
    private int provisions;
    
        
    public Game()  { }

    public Player getPlayer() 
   { 
      return thePlayer; 
   }

    public void setPlayer(Player _thePlayer)
   {
      thePlayer = _thePlayer;
   }
    
    public void setCropData(CropData _cropData)
    {
      cropData = _cropData;
    }  
    public CropData getCropData() {
       return cropData;
    }
    public void setAnimals(int _animals)
    {
      animals = _animals;
    }  
    public int getAnimals() {
       return animals;
    }
    public void setTools(int _tools)
    {
      tools = _tools;
    }  
    public int getTools() {
       return tools;
    }
    public void setProvisions(int _provisions)
    {
      provisions = _provisions;
    }  
    public int getProvisions(){
       return provisions;
    }

}