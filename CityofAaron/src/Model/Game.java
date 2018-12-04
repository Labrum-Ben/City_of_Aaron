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
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> provisions;
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
    public void setTools(ArrayList<ListItem> tools)
    {
      tools = new ArrayList<ListItem>(tools);
    }  
    public ArrayList<ListItem> getTools() {
       return tools;
    }
    public void setProvisions(ArrayList<ListItem> _provisions)
    {
       provisions = new ArrayList<ListItem>(_provisions);
    }  
    public ArrayList<ListItem> getProvisions(){
       return provisions;
    }
    public void setMap(Map _map) {
     theMap = _map;
    }   

}