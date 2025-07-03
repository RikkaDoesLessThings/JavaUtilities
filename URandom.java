public class URandom extends JavaUtilities {
    // Generates a random string of letters
    public static String letters(int length, int caps)
    {
        String letterSet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        if (caps == 1)
        {
            for(int i = 0; i < length; i++)
            {
                //result += letterSet[(int)(Math.random()*26)];
                result += letterSet.charAt((int)(Math.random()*26));
            }
        }
        //
        else if (caps == 2)
        {
            for(int i = 0; i < length; i++)
            {
                
                //result += Character.toUpperCase(letterSet[(int)(Math.random()*26)]);
                result += Character.toUpperCase(letterSet.charAt((int)(Math.random()*26)));
            }
        }
        //
        else
        {
            for(int i = 0; i < length; i++)
            {
                int upperOrLower = (int)(Math.random()*2);
                if (upperOrLower == 1)
                {
                    //result += letterSet[(int)(Math.random()*26)];
                    result += letterSet.charAt((int)(Math.random()*26));
                }
                else
                {
                    //result += Character.toUpperCase(letterSet[(int)(Math.random()*26)]);
                    result += Character.toUpperCase(letterSet.charAt((int)(Math.random()*26)));
                }
            }
            
        }
        return result;
    }
    
    // Generates a random number(s) with a length of (parameter) integer length
    public static String numbers(int length)
    {
        String result = "";
        for(int i = 0; i < length; i++)
        {
            result += String.valueOf((int)(Math.random()*10));
        }
        return result;
    }
    
    // Generates random set of symbols (string)
    public static String symbols(int length)
    {
        String symbolSet = "`~!@#$%^&*()-_=+[]}{|;:',.<>/?";
        String result = "";
        for(int i = 0; i < length; i++)
        {
            result += symbolSet.charAt((int)(Math.random()*26));
        }
        return result;
    }
}