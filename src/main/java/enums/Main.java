package enums;

import static enums.MaritalStatus.*;

/**
 * Created by Evegeny on 20/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Human tzvika = new Human("Tzvika", MARRIED);
        Human uri = new Human("Uri", MARRIED);
        System.out.println(
                tzvika.getMaritalStatus() == uri.getMaritalStatus());

        String hebrewDesc = tzvika.getMaritalStatus().getHebrewDesc();
        System.out.println("hebrewDesc = " + hebrewDesc);
    }
}
