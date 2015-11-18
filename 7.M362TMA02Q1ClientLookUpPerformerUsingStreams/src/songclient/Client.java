/*
 * Client.java
 * 
 Incomplete client class
 *
 * Created on 29 October 2010, 20:54
 *
 * @Author M362 Course Team
 */

package songclient;
import java.io.*;
import java.net.*;


public class Client {
    
 //TODO step 2
   
static final public int PORT_NUMBER = 1116;

private BufferedReader input, in;
private Writer output;    


public Client() throws IOException {
  in = new BufferedReader(new InputStreamReader(System.in));  //1

//TODO step 2 set up sockets and streams for reading and writing  
  Socket sock = new Socket(InetAddress.getLocalHost(), PORT_NUMBER);
  Reader isread = new InputStreamReader(sock.getInputStream());
  input = new BufferedReader(isread);
  output = new PrintWriter(sock.getOutputStream(), true);
  
  
System.out.println("all sockets, printers and readers set up"  );

  
  // receive instructions from server
   String line1 = input.readLine();             		
   System.out.println(line1);

  // read user's choice
   String line2 = in.readLine();            		
 
 // write user's choice to server  
   output.write(line2 + "\n");
   output.flush();

 
  // receive answer
   String line3 = input.readLine();
   System.out.println(line3);

  }
}
