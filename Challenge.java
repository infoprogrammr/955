 
import java.util.Scanner; 
 
public class Challenge { 
 
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("What is your name: "); 
        String name = scanner.next();
        	System.out.println("age:"); 
		String age = scanner.next();
		String echo = ""; 
		///{ 
	 
		//start your coding here  
     
        echo = "Hello "+name;
    
           

		///}   
 
                System.out.println(echo);
                 System.out.println("age:"+age);
                scanner.close();
	} 
} 
