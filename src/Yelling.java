
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
	
	else if( name.length >= 2)
	{
		System.out.println("hello");
		String n = "";
		for(int i = 0; i< name.length ; i++)
		{

				n =	n + name[i] ; 
				System.out.println("for loop");
				if(i<(name.length-2))
				{
					n = n + " , ";
				}
				else if((name.length-2) == i)
				{
					n = n + " and ";
				}
				
		}return n + yelling;
				
	}	
		
	
	return "Nobody is yelling";
}


}
