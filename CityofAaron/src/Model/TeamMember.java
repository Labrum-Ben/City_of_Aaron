/*
 * The CityofAaron file for the CityofAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */
package Model;

/**
 *
 * @author theag
 */
    public enum TeamMember {
     // The members of the enumeration
    BEN("Ben","The Brave"),
    ADRIENNE("Adrienne","The Wise");
    
    TeamMember(String _name, String _title)
 {
     name = _name;
     title =_title;
     
  }
 
    private String name;
    private String title;
    // The getName() method
    // Purpose: returns the value stored in name
    // Parameters: none
    // Returns: the value stored in name
    public String getName()
    {
        return name;
    }
   public String getTitle()
    {
        return title;
    }
}
