/*
 * The CityofAaron file for the CityofAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */

package Model;

import java.io.Serializable;

/**
 *
 * @author theag
 */


public class Player implements Serializable {

    private String name;
    
    public Player()  { }


    public String getName()  {
        return name;
       
}
    public void setName(String myPlayer)  {
        name = myPlayer;
    }
   
      }
 


