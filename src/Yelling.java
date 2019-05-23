
public class Yelling{
	
	//check upper case additional function
private static boolean isStringUpperCase(String str){
        
        //convert String to char array
        char[] charArray = str.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            
            //if any character is not in upper case, return false
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }
        
        return true;
    }
//////////////////////
public String Scream(String name)
{
	if(name != "null")
	{
		String yelling = " is yelling";
		boolean checkCase = isStringUpperCase(name);
		if(checkCase == true)
		{
			yelling = yelling.toUpperCase();
		}
		
	return name + yelling;
	}
	return "Nobody is yelling";
	
}
}
