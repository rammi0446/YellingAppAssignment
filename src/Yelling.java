
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

//////////////////////////////////////////////////////////////////////
public String Scream(String[] name)
{
	boolean checkCase = false;
	String yelling = " is yelling";
	String n = "";
	String upper = "hello";
	
	if(name[0] != "null" && name.length==1)
	{
		checkCase = isStringUpperCase(name[0]);
		
		if(checkCase == true)
		{
			yelling = yelling.toUpperCase();
		}	
		return name[0] + yelling;
	}
	
	
	//more than two people
	else if( name.length >= 2)
	{
		
		for(int i = 0; i< name.length ; i++)
		{ 
				if(isStringUpperCase(name[i]))
				{
					upper = name[i];
				}
					n =	n + name[i] ; 
					if(i<(name.length-2))
					{
						n = n + " , ";
					}
					else if((name.length-2) == i)
					{
						n = n + " and ";
					}		
		}
		
		if(upper.toUpperCase()==upper)
		{
			return n+ yelling +". so is " +upper;
		}
		return n + yelling;
				
	}	
	return "Nobody is yelling";
}


}
