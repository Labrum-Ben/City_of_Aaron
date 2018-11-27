/*
 * The CityofAaron file for the CityofAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */


package Model;

/**
 *
 * @author Adrienne Groll
 */
import java.io.Serializable;
import java.util.ArrayList;



public class Game implements Serializable {
   
    private Player thePlayer;
    private CropData cropData;
    private ArrayList<ListItem> animals;
    private int tools;
    private int provisions;
    private Map theMap;
    
        
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
    public void setAnimals(ArrayList<ListItem> _animals)
     {
           animals = new ArrayList<ListItem>(_animals);
     }
    public ArrayList<ListItem> getAnimals() 
    {
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
    public void setMap(Map _map) {
     theMap = _map;
    }

}