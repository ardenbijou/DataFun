import java.util.Scanner;

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
        System.out.print("and ");
        switch (favnum) {
            case 2:
                System.out.println("it's the atomic number for helium");
                break;
            case 10:
                System.out.println("it's the atomic number for neon");
                break;
            case 18:
                System.out.println("it's the atomic number for argon");
                break;
            case 36:
                System.out.println("it's the atomic number for krypton");
                break;
            case 54:
                System.out.println("it's the atomic number for xenon");
                break;
            case 88:
                System.out.println("it's the atomic number for radon");
                break;
            default:
                System.out.println("it's not the atomic number of a noble gas");
        }


        System.out.println();
        System.out.println("now, what's your favorite character?");
        String og = input.nextLine();
        char ch = og.charAt(0);

        if(ch >= 'A') {
            if(ch <= 'Z') {
                System.out.println(ch + " is an uppercase letter,");
            }} else if(ch >= 'a') {
                if(ch <= 'z') {
                    System.out.println(ch + " is a lowercase letter");
                }} else if(ch >= '0') {
            if(ch <= '9') {
                System.out.println(ch + " is a numeric digit,");
            }}

        switch(ch) {
            case 'A':
            case 'E':
            case 'I':
                System.out.println("it's a vowel, ");
                break;
        }
        }
        }
