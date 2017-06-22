package enums;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class HttpCodeMain {
    public static void main(String[] args) {
        HttpService httpService = new HttpService();
        try {
            httpService.handleHttpCode(2500);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Have a good day!!!");
    }
}
