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
public class Location {
    private String description;
    private String symbol;

    public Location (){}
        
    public String getDescription()
    {
	return description;
    }
	
    public String getSymbol()
    {
	return symbol;
    }    
    
    public void setDescription(String _description)
    {
        description = _description;
    }
    
    public void setSymbol(String _symbol)
    {
        symbol = _symbol;
    }
}
