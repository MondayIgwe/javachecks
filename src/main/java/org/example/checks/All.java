package org.example.checks;

import org.example.utility.CommonUtils;

public class All implements CommonUtils {

    public static void runData() throws Exception {
        String name  = "<sam is king?";
        System.out.println(Character.hashCode(name.charAt(1)));
        System.out.println(Integer.valueOf(name.charAt(1)));

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i : numbers) {
            System.out.println(i);
        }


    }
}
