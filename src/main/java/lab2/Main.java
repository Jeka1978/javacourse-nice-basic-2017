package lab2;

/**
 * Created by Evegeny on 13/06/2017.
 */
public class Main {
    public static void main(String[] args) {

        double[] doubles = {42, 73, 56.6};
        int[] nums = new int[doubles.length];

        for (int i = 0; i < doubles.length; i++) {
            nums[i] = (int) doubles[i];
        }

        for (int num : nums) {
            System.out.println("num = " + num);
        }


    }
}
