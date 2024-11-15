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
                System.out.println("it's the atomic number for helium.");
                break;
            case 10:
                System.out.println("it's the atomic number for neon.");
                break;
            case 18:
                System.out.println("it's the atomic number for argon.");
                break;
            case 36:
                System.out.println("it's the atomic number for krypton.");
                break;
            case 54:
                System.out.println("it's the atomic number for xenon.");
                break;
            case 88:
                System.out.println("it's the atomic number for radon.");
                break;
            default:
                System.out.println("it's not the atomic number of a noble gas.");
        }


        System.out.println();
        System.out.println("alright, now, what's your favorite character?");
        String og = input.nextLine();
        char ch = og.charAt(0);

        if(ch >= 'A') {
            if(ch <= 'Z') {
                System.out.println(ch + " is an uppercase letter,");
            }}
        if(ch >= 'a') {
            if(ch <= 'z') {
                System.out.println(ch + " is a lowercase letter");
                }} 
        if(ch >= '0') {
            if(ch <= '9') {
                System.out.println(ch + " is a numeric digit,");
            }}

        switch(ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':    
                System.out.println("it's a vowel, ");
                break;
            case 'Y':
            case 'y':
            case 'W':
            case 'w':
                System.out.println("it's SOMETIMES a vowel, ");
                break;    
        }
        if(ch >= '0') {
            if(ch <= '9') {
                System.out.print("and ");
            }}
        System.out.print("it has an ascii value of ");
        System.out.print((int) ch);
        if(ch >= '0') {
            if(ch <= '9') {
                System.out.print(".");
            }}
        if(ch < '0') {
            System.out.println(",");
        }
        if(ch > '9') {
            System.out.println(",");
        }
        if(ch >= 'A') {
            if(ch <= 'Z') {
                ch = Character.toLowerCase(ch);
            }}
        if(ch >= 'a') {
            if(ch <='z') {
                int ascii = (int)ch;
                int chint = ascii - 96;
                System.out.print("and it's the " + chint);
                switch(chint) {
                    case 1:
                    case 21:
                        System.out.print("st");
                        break;
                    case 2:
                    case 22:
                        System.out.print("nd");
                        break;
                    case 3:
                    case 23:
                        System.out.print("rd");
                        break;
                    default:
                        System.out.print("th");            
                }}
                System.out.print(" letter of the alphabet.");
        }
    }}