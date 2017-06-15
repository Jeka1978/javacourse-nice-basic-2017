package io;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Evegeny on 15/06/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable{

    private String name;
    private transient int age;

    public void printNumbers(String a,int... nums) {
        int[] arr = nums;
    }
}
