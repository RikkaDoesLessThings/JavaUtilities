import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class JavaUtilities {
    
    public static boolean clipboard(String string) {
        try {
            StringSelection stringSelection = new StringSelection(string);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    /*
    // Private for clock, ignore
    private static String addUpClock(int char1, int char2, int char3, int char4, String amPm, boolean amPmTF) {
        if (amPmTF == true) {
            return (char1+char2+":"+char3+char4+" "+amPm);
        } else {
            return (char1+char2+":"+char3+char4);
        }
    }
    //end
    
    // Temporarily disabled
    public static String clock(int num1, int num2, int num3, int num4, String amPm, boolean amPmTF) {
        try {
            // Sort of--Constructor
            int char1;
            int char2;
            int char3;
            int char4;
            if (num1 != null) {
                char1 = num1;
            } else {
                char1 = 0;
            }
            if (num2 != null) {
                char2 = num2;
            } else {
                char2 = 1;
            }
            if (num3 != null) {
                char3 = num3;
            } else {
                char3 = 0;
            }
            if (num4 != null) {
                char4 = num4;
            } else {
                char4 = 0;
            }
            
            if (amPm != null){}else{
                amPm = "AM";
            }
            if (amPmTF != null){}else {
                amPmTF = false;
            }
            // End of constructor
            
            char4++;
            if (char4 == 10) {
                char3++;
                char4 = 0;
            }
            if (char3 == 6) {
                char2++;
                char3 = 0;
            }
            if (char2 == 10) {
                char1++;
            }
            if (char2 == 3 && char1 == 1) {
                char1 = 0;
                char2 = 1;
                if (amPmTF == true) {
                    if (amPm.equals("AM")) {
                        amPm = "PM";
                    } else {
                        amPm = "AM";
                    }
                }
            }
            return addUpClock(char1, char2, char3, char4, amPm, amPmTF);
        } catch (Exception err) {
            System.out.println(err);
        }
    }*/
    
    public static Object solver(String evaluate) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval(evaluate);
        return result;
    }
    
}