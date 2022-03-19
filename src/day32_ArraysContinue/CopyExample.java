package day32_ArraysContinue;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
        int [] a ={1,2,3};
        int [] b =a;  // b is a new reference / name but the array is the same as the one 'a' reference/name is pointing is to
        // so there is only one array made
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] =100;
        b[1] =200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println();

        int [] z = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(z));

        z[0] = 500;

        System.out.println("A: " +Arrays.toString(a));
        System.out.println("Z: " +Arrays.toString(z));
    }
}
