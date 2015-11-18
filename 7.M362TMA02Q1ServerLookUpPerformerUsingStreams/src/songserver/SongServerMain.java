/*
 * SongServerMain.java
 *
 * Created on 29 October 2010, 18:04
 *
 * @author m362 Course Team
 */

package songserver;


import java.io.IOException;

/**
 *
 * @author m362 Course Team
 */
public class SongServerMain
{
   
   public static void main(String[] args)
   {
      try
      {
         SongServer server= new SongServer();
      }
      catch (IOException ex)
      {
         ex.printStackTrace();
      }
   }
   
}

