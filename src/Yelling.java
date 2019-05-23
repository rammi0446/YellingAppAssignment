
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

/////////////////////////////////////////////////////////////////////////////
public String Scream(String[] name)
{

	String yelling = " is yelling";
	if(name[0] != "null" && name.length==1)
	{
		boolean checkCase = isStringUpperCase(name[0]);
		if(checkCase == true)
		{
			yelling = yelling.toUpperCase();
		}	
		return name[0] + yelling;
	}
	
	else if(name[0] != "null" && name.length <= 2)
	{
		return name[0] + " and " + name[1]+ yelling;
	}
	return "Nobody is yelling";
}


}
