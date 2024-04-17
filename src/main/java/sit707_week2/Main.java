package sit707_week2;

import java.io.IOException;

import sit707_week2.SeleniumOperations;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args ) throws IOException
    {
       SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
    	//SeleniumOperations.open_chrome_and_close();
    }
}
