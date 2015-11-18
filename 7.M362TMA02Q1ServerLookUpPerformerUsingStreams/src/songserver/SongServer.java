/*
 * SongServer.java
 *
 * Created on 29 October 2010, 18:07
 *
 * @author m362 Course Team
 */

package songserver;

import java.net.*;
import java.io.*;


public class SongServer
{
   static final public int PORT_NUMBER = 1116;
   public static String newline = System.getProperty("line.separator");
     
   
   public SongServer() throws IOException
   {
      ServerSocket listener = new ServerSocket(PORT_NUMBER);
       SongTitles myTitles= new SongTitles();
       
      {
         System.out.println("Waiting for a client");
         Socket sock = listener.accept();
         
         // create output and input streams through the socket
         OutputStreamWriter out = new OutputStreamWriter(sock.getOutputStream());
         Reader isread = new InputStreamReader(sock.getInputStream());
  	 BufferedReader in = new BufferedReader(isread);
         
         try
         {
                    
            String temp= myTitles.selectTitle();
            
            out.write(temp);
            out.flush();
            Thread.sleep(1000);
            
            String name = in.readLine();
            
            String temp1 = myTitles.supplyPerformer(name);
            out.write(temp1);
            out.flush();
            Thread.sleep(1000);     
            
            out.close(); 
         }
         catch (IOException ex)
         {
            ex.printStackTrace();
         }
         catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
         
      }
   }
   
}
