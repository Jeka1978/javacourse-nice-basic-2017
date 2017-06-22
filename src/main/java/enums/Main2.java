package enums;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class Main2 {
    public static void main(String[] args) {
        int dbCode = 2;
        MaritalStatus status = MaritalStatus.findByDbCode(2);
        String hebrewDesc = status.getHebrewDesc();
        System.out.println(hebrewDesc);
    }
}
