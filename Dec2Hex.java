import java.util.logging.Logger;
public class Dec2Hex{
	private static int arg1;
	private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    	public static void main(String[] args)
	{
        	if (args.length == 0)
		{
        	    logger.severe("Error: No input argument provided. Please provide an integer to convert.");
            	    return;
        	}
        	try
		{
	  		setArg1(Integer.parseInt(args[0]));
        	}
		catch (NumberFormatException e)
		{
            		logger.severe("Error: Invalid input. Please provide an integer to convert.");
	    		return;
		}

		char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        	int rem;
		int num;
        	num = getArg1();
		StringBuilder hexadecimal = new StringBuilder();
        	logger.info("Converting the Decimal Value " + num + " to Hex...");
		while (num != 0)
		{
            		rem = num%16;
            		hexadecimal.insert(0, ch[rem]);
            		num = num/16;
        	}
		logger.info("Hexadecimal representation is: " + hexadecimal);
	}

	public static int getArg1() 
	{
        	return arg1;
    	}
    	public static void setArg1(int inputValue) 
	{
        	arg1 = inputValue;
    	}
	
}
