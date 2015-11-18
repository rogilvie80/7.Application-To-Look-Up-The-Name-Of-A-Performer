/*
 * SongTitles.java
 *
 * Created on 29 October 2010, 18:50
 *
 *  @author m362 Course Team
 */


package songserver;

import java.io.*;

public class SongTitles 
{

  //TODO  - step 1
  // sample data stored 
    
  private String []titles = {"Get Back", "Paint It Black", "Blitzkrieg Bop", "Rock and Roll"};
  private String []performers = {"The Beatles", "Rolling Stones", "Ramones", "Led Zeppelin"};

  
  public String selectTitle() { 
      
   String temp = "Key in number for selected title:";
   for (int i = 0; i < titles.length; i++)
   {
       temp = temp +" " + i + "= " + titles[i];       
   }
   
  temp = temp + "\n";
   return temp;
  }
  
  
  public String supplyPerformer (String choice) {
    
    
    int n = Integer.parseInt(choice);
    if (n < performers.length)
    {            
        return(performers[n] +"\n");
    }
    else return ("No title selected");
  }
           
}

