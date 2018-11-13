/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ben
 */
public class ListItem {
   private String  name;
   private int number;
   
public ListItem(){}

public String getName()
    {
    return name;
    }
    
public int getNumber()
{
 return number;  
}    


public void setName(String _name)
{
 name = _name;   
}

public void setNumber(int _number)
{
number = _number;
}
}