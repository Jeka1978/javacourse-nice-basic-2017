package mySpring;

import lombok.Data;

/**
 * Created by Evegeny on 27/06/2017.
 */
@Data
public class Elf {
    @InjectRandomInt(min = 10, max = 20)
    private int hp;
    @InjectRandomInt(min = 30, max = 50)
    private int power;


    @InjectRandomName
    private String name;

}
