import java.util.*; 

public class phoneNumberVerification {

	 public static void main(String[] args) {
Scanner keyboard = new Scanner (System.in);
System.out.println("Enter your phone number"); 
String phoneNumber = keyboard.next(); 
      boolean results =   validatePhoneNumber(phoneNumber);
      String theResult = String.valueOf(results); 
      if (theResult == "true"){
    	  theResult = "valid";     		  
      }
      else {
    	  theResult = "invalid"; 
      }
System.out.println("This number: " + phoneNumber + " is " + theResult);
	 }

	 private static boolean validatePhoneNumber(String phoneNumber) {
	  // validate phone numbers of format "1234567890"
	  if (phoneNumber.matches("\\d{10}"))
	   return true;
	  // validating phone number with -, . or spaces
	  else if (phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
	   return true;
	  // validating phone number with extension length from 3 to 5 places
	  else if (phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
	   return true;
	  // validating phone number where area code is in braces ()
	  else if (phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
	   return true;

	  // return false if nothing matches the input
	  else
	   return false;

	 }
	}
