
public class ConsoleColours {

    //Reset KEYS
    /**
     * Resets all attributes
     * */
    public static final String RESET = "\033[0m";
    public static final String RESET_BOLD = "\033[21m"; //Resets bold attribute.
    public static final String RESET_ITALIC = "\033[23m";//Resets italic attribute.
    public static final String RESET_UNDERLINE = "\033[24m"; //Resets underlined attribute.
    public static final String RESET_STRIKE = "\033[29m"; // Resets strike attribute.
    public static final String RESET_CIRCLE = "\033[54m"; // Resets circled and framed attribute.

    //Text Colour
    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";
    public static final String GRAY = "\033[0;90m";
    public static final String ANSI_BRIGHT_RED = "\033[1;31m";
    public static final String BRIGHT_GREEN = "\033[0;92m";
    public static final String BRIGHT_YELLOW = "\033[0;93m";
    public static final String BRIGHT_BLUE = "\033[0;94m";
    public static final String BRIGHT_MAGENTA = "\033[0;95m";
    public static final String BRIGHT_CYAN = "\033[0;96m";
    public static final String BRIGHT_WHITE = "\033[0;97m";
    public static final String PINK = "\033[38;2;255;82;197m";

    //Additional
    public static final String BOLD = "\033[1m";
    public static final String CIRCLED = "\033[52m";
    public static final String UNDERLINED = "\033[4m";
    public static final String ITALIC = "\033[3m";
    public static final String REVERSE = "\033[7m";
    public static final String STRIKE = "\033[9m";
    public static final String FRAMED = "\033[51m";





    /**
     * RGB colour for the background and foreground of console text
     *
     * <p></p>
     *
     * @param foregroundR red value for the foreground
     *
     * @param foregroundG green value for the foreground
     *
     * @param foregroundB blue value for the foreground
     *
     * @param backgroundR red value for the background
     *
     * @param backgroundG green value for the background
     *
     * @param backgroundB blue value for the background
     *
     * */
    public static String setRGB(int foregroundR, int foregroundG, int foregroundB, int backgroundR, int backgroundG, int backgroundB) {
            return ForegroundRGB(foregroundR, foregroundG, foregroundB)
                    + BackgroundRGB(backgroundR, backgroundG, backgroundB);
    }

    /**
     *
     * 256 different colours.
     *
     * <p></p>
     *
     * @param foregroundColourNr The number of the foreground colour.
     * @param backgroundColourNr The number of the background colour.
     * */
    public static String set8BIT(int foregroundColourNr, int backgroundColourNr){
            return Foreground8Bit(foregroundColourNr)
                    + Background8Bit(backgroundColourNr);
    }


    /**
     * Sets the rgb text colour of the text on a print statement.
     * <p></p>
     * @param r The green value of the colour
     * @param g the green value of the colour
     * @param b the blue value of the colour
     *
     * */

    public static String ForegroundRGB(int r, int g, int b) {
        if( Math.abs(r) >255 || Math.abs(g) < 255 || Math.abs(b) > 255){
            throw new IndexOutOfBoundsException();
        }
        return "\033[38;2;" + Math.abs(r) + ";" + Math.abs(g) + ";" + Math.abs(b)+"m";
    }
    /**
     * Sets the rgb background colour of the print statement.
     * <p></p>
     * @param r The green value of the colour
     * @param g the green value of the colour
     * @param b the blue value of the colour
     *
     * */
    public static String BackgroundRGB(int r, int g, int b) {
        if( Math.abs(r) >255 || Math.abs(g) < 255 || Math.abs(b) > 255){
            throw new IndexOutOfBoundsException();
        }
        return "\033[48;2;" + Math.abs(r) + ";" + Math.abs(g) + ";" + Math.abs(b)+"m";
    }
    /**
     * Sets the text colour of the text on a print statement.
     * @param nr The index of the color you want the text to be
     * */
    public static String Foreground8Bit(int nr){
        if( Math.abs(nr) > 255 ){
            throw new IndexOutOfBoundsException();
        }
        return "\033[38;5;" + Math.abs(nr)+"m";

    }
    /**
     * Sets the background colour of a print statement.
     * @param nr The index of the color you want the background to be
     * */
    public static String Background8Bit(int nr){
        if( Math.abs(nr) > 255 ){
            throw new IndexOutOfBoundsException();
        }
        return "\033[48;5;" + Math.abs(nr)+"m";

    }

}


