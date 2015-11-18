/*
 * Main.java
 *
 * Created on 29 October 2010, 20:52
 *
 * @Author M362 Course Team
 */

package songclient;

import java.io.IOException;


public class Main {
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try {
	Client world = new Client();
	}  catch (IOException e) {System.out.println("Received an IO exception " +  e);}

    }
    
}
