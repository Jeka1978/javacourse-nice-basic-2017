package inheritance;

import lombok.Data;

/**
 * Created by Evegeny on 15/06/2017.
 */
@Data
public class Father {
    private int age;

    public void work(){
        System.out.println("Working...");
    }

    public Father(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        double x=1.1;
        double y = 1.3;
        System.out.println(x+y);
    }
}






