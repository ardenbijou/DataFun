import java.util.Scanner;

import static jdk.vm.ci.meta.JavaKind.Int;

/**
     * Description goes here
     * @author arden
     * @version 11/5/24
     */
public class DataFun{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hi ! what's your favorite integer ?");
        int favnum = input.nextInt();
        input.nextLine();
        if (favnum >= 0) {
            System.out.println(favnum + " is a positive number,");
        } else {
            System.out.println(favnum + " is a negative number,");
        }
        if (favnum >= 1000) {
            System.out.println("it's greater than 1000,");
        } else if (favnum >= 100) {
            System.out.println("it's greater than 100,");
        } else if (favnum >= 10) {
            System.out.println("it's greater than 10,");
        } else {
                System.out.println("it's less than 10,");
            }
        if (favnum % 2 == 0) {
            System.out.println("it's an even number,");
        } else {
            System.out.println("it's an odd number,");
        }
        switch (favnum)
        }

    }
