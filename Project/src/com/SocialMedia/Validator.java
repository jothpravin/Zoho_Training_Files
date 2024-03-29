import java.util.regex.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;  
import java.time.Period;  

public class Validator
{
	public static boolean emailValidator(String email)
	{
		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        					+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        	
        	Pattern p = Pattern.compile(regexPattern);
        	Matcher matcher = p.matcher(email);
    		return matcher.matches();
	}
	
	public static boolean ageValidator(String dob)
	{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        	LocalDate d = LocalDate.parse(dob, formatter);  
        	LocalDate cur = LocalDate.now();
        	int age =  Period.between(d, cur).getYears();
        	if(age >= 18)
        	{
			return true;
        	}
		return false;
	}
	public static boolean isValidPassword(String password)
    {
 
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
 
        Pattern p = Pattern.compile(regex);

        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
 
        return m.matches();
    }
}
