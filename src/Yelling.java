
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
	boolean checkCase = false;
	String yelling = " is yelling";
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
		String n = "";
		String upper = "";
		
		for(int i = 0; i< name.length ; i++)
		{
			 checkCase = isStringUpperCase(name[i]);
		
				if(checkCase == true)
				{
					upper = name[i];
					n =	n + name[i] ;
				}
				
				else if(checkCase == false)
				{
				n =	n + name[i] ; 
				if(i<(name.length-2))
				{
					n = n + " , ";
				}
				else if((name.length-2) == i)
				{
					System.out.println(i + n +name.length);
					n = n + " and ";
				}
				}
		}
		return n + yelling;
				
	}	
	return "Nobody is yelling";
}


}
