public class UManipulation extends JavaUtilities {
    // Swaps the casing in a string (From "Hello World!" to "hELLO wORLD!")
    public static String swapcase(String input)
    {
        String result = "";
        for(int i = 0; i < input.length(); i++)
        {
            String letter = input.substring(i,i+1);
            if (letter.toUpperCase().equals(letter))//confirms if it is uppercase
            {
                result += letter.toLowerCase();
            }
            else //if it is not uppercase(lowercase)
            {
                result += letter.toUpperCase();
            }
        }
        return result;
    }
    
    // Counts the words in a string ("Hello World!" would output: 2)
    public static int wordCount(String input)
    {
        input += " ";
        int streak = 0;
        int result = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if (!(Character.isWhitespace(input.charAt(i))))
            {
                streak++;
            }
            else if (Character.isWhitespace(input.charAt(i)) && streak != 0)
            {
                streak = 0;
                result++;
            }
        }
        return result;
    }
}