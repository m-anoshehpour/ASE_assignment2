import java.io.*;
import java.lang.String;


public class mainProgram {

	public static void printUsermenu()
	{
		 System.out.println("User Menu");
		 System.out.println("=========");		
		 System.out.println("1. Add User");
		 System.out.println("2. Delete User");
		 System.out.println("3. Set User");
		 System.out.println("4. Set User privilege");		 
		 System.out.println("");
		 System.out.println("0. Quit");			
	
	}
	
			  
	public static void printBugmenu()
	{
		 System.out.println("Bug Menu");
		 System.out.println("========");		
		 System.out.println("1. ");
		 System.out.println("2. ");
		 System.out.println("3. ");
		 System.out.println("");
		 System.out.println("0. Quit");			
	}
	
			  
	public static void printProductmenu()
	{
		 System.out.println("Product Menu");
		 System.out.println("============");		
		 System.out.println("1. ");
		 System.out.println("2. ");
		 System.out.println("3. ");
		 System.out.println("");
		 System.out.println("0. Quit");			
	}	
		
		
	public static void usermenu()
	{
		printUsermenu();
	
	}
	
		  
	public static void bugmenu()
	{
		printBugmenu();
	}
	
		  
	public static void productmenu()
	{
		printProductmenu();
	}
	
	
	
	
	
	
	public static void printMainMenu()
	{
		 System.out.println("Main Menu");
		 System.out.println("=========");
		 System.out.println("");		
		 System.out.println("1. User Menu");
		 System.out.println("2. Bug Menu");
		 System.out.println("3. Product Menu");
		 System.out.println("");
		 System.out.println("0. Quit");
	     System.out.print("Enter menu option: ");
	}
	
	public static String askChoice()
	{
		  String option="";
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      //  read the menu option from the command-line; need to use try/catch with the
	      //  readLine() method
	      try {
	         option = br.readLine();
	      } catch (IOException ioe) {
	         System.out.println("IO error trying to read the console!");
	         System.exit(1);
	      }
		  return option;
		
	}
	
	public static void main(String [ ] args)
	{
		boolean quit = false;
		String choice="";
		//  set up loop to terminate on quit option
		while (quit==false)
		{
		  printMainMenu();	
		  //  ask user for choice
		  choice=askChoice();
		  switch (choice)
	      {
	      case "1":
	    	  usermenu();
	    	  break;
	      case "2":
	    	  bugmenu();
	    	  break;
	      case "3":
	    	  productmenu();
	    	  break;	  
	      case "0":
	    	  quit = true;
	    	  break;		  
	      	default:
	  	      System.out.println("Unrecognised option...");
	  	      break;
	      }
		}  
	}
}
