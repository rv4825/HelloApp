/**
 * OOPSBannerApp UC5 - using array inline
 * 
 * @Rithvik Devloper
 * @version 2
 * 
 */

// extend the program to write OOPS using array inline

public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] lines = {
                String.join("   ", "  *****   ", "  *****   ", "*******   ", "  *****  "),
                String.join("   ", " *     *  ", " *     *  ", "*      *  ", " *     * "),
                String.join("   ", "*       * ", "*       * ", "*      *  ", "*        "),
                String.join("   ", "*       * ", "*       * ", "*******   ", "  *****  "),
                String.join("   ", "*       * ", "*       * ", "*         ", "       * "),
                String.join("   ", " *     *  ", " *     *  ", "*         ", " *     * "),
                String.join("   ", "  *****   ", "  *****   ", "*         ", "  *****  ")
        };

        for (String line : lines) {
            System.out.println(line); // or for(String line : lines)

        }
    }
}