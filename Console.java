

public class Console
{
	public static void printPrompt(String prompt)
	{
		System.out.print(prompt + " ");
		System.out.flush();
	}
	
	public static String readString()
    {
	    int ch;
	    String r="";
	    boolean done=false;
	    while (!done)
	    	{
	        try
	        	{
	            ch=System.in.read();
	            if (ch < 0 || (char)ch == '\n')
	            	done=true;
	            else
	            	if ((char)ch != '\r')
	                	r=r + (char) ch;
	            }
	        catch(java.io.IOException e)
	        	{
	            done=true;
	            }
		}
		return r;
	}
	
	public static String readString(String prompt)
	{
	    printPrompt(prompt);
	    return readString();
	}
	
	public static char readChar()
	{
	    while (true)
	    	{
	        try
	        	{
	            return readString().charAt(0);
	            }
	        catch(Exception e)
	            {
	            System.out.println("No es un caracter. Pruebe otra vez!");
	            }
	        }
	}
	
	public static char readChar(String prompt)
	{
	    printPrompt(prompt);
	    return readChar();
	}
	
	public static int readInt()
	{
	    while(true)
	    	{
	        try
	        	{
	            return Integer.valueOf(readString().trim()).intValue();
	            }
	        catch(NumberFormatException e)
	        	{
	            System.out.println("No es un entero. Pruebe otra vez!");
	            }
	       	}
	}
	
	public static int readInt(String prompt)
	{
	    printPrompt(prompt);
	    return readInt();
	}
	
	public static double readDouble()
	{
	    while(true)
	    	{
	        try
	        	{
	            return Double.valueOf(readString().trim()).doubleValue();
	            }
	        catch(NumberFormatException e)
	        	{
	            System.out.println("No es un double. Pruebe otra vez!");
	            }
	        }
	}
	
	public static double readDouble(String prompt)
	{
	    printPrompt(prompt);
	    return readDouble();
	}
	
	public static float readFloat()
	{
		while(true)
			{
			try
				{
				return Float.valueOf(readString().trim()).floatValue();
				}
			catch(NumberFormatException e)
				{
				System.out.println("No es un float. Pruebe otra vez!");
				}
			}
	}
	
	public static float readFloat(String prompt)
	{
		printPrompt(prompt);
		return readFloat();
	}
	
}
