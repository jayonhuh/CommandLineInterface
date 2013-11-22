import java.io.*;
import java.util.*;

public class CommandLineInterface {

	public static void main(String args[]) throws IOException {


		/* Initially creating a scanner object to read from the command line
		 * and a ChatClient object in order to connect to the server and start
		 * communicating. */
		Scanner in = new Scanner(System.in);
		String input = null;
		ChatClient client = null;


		// enter infinite loop where user interacts with the command line
		while(true) {

			/* hard-coded servers but this can be implemented by asking 
			 * ChatClient to print out servers. */

			// example: client.printServers();  
        	System.out.println("Servers:");
        	System.out.println("\t(1) Test server 1");
        	System.out.println("\t(2) Test server 2");
        	System.out.print("Please specify server: ");

        	// create int to hold user's selection
        	int selection;

        	// try and catch exeptions.
        	try
        	{
        		selection = in.nextInt();
        	}
        	catch (InputMismatchException e)
        	{
        		System.out.println("Please enter choice 1 or 2");
        		continue;
        	}
        	catch (NoSuchElementException e)
        	{
        		System.out.println("Please enter choice 1 or 2");
        		continue;
        	}

        	if (selection == 2)
        	{
        		System.out.println("Test server 2 not avalible.");
        	}
        	else if (selection != 1)
        	{
        		System.out.println("Please enter choice 1 or 2");
        	}
        	else 
        	{

        		// since a right server has been specified, get the client to connect to it.
        		try 
	    		{
	    			
	    			/* 
	    			 * We have some other function wire the ChatClient 
	    			 * to the communication platform
	    			 */
	    			client = wireClient();
	    	          System.out.println("ChatClient connected.");
	    			/* 
	    			 * Now we can happily send messages around
	    			 */
		    		break;
		    		
	    		} catch (JMSException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		} catch (URISyntaxException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}

        	}

		}

		




	}