import java.util.Scanner;

class inputandoutput {
    public static void main(String[] args) {
        /*
           you can simply use -
         * System.out.println(); or
         * 
         * System.out.print(); or
         * 
         * System.out.printf();
         */

        System.out.println("java programming is interesting");

        //print() it prints string inside the quotes
        // println() it prints the strin inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line
        // printf() it provides string formatting 
        System.out.println("1. println ");
        System.out.println("2. println ");
    	
        System.out.print("1. print ");
        System.out.print("2. print");

        System.out.println("");
        //print concatenated strings
        Double number = -10.6;
        System.out.println("I am "+"awesome.");
        System.out.println("number = "+number);

        System.out.println(" ");
        // Input
        //Get the integer input from the use
        Scanner input = new Scanner(System.in);

        //Getting integer input
        System.out.println("Enter an integer: ");
        int number1 = input.nextInt();
        System.out.println("you entered "+number1);

        //Getting float input
        System.out.println("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered + "+myFloat);

        //Getting double input
        System.out.println("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered: "+myDouble);

        //Getting String input
        System.out.println("enter text: ");
        String myString = input.next();
        System.out.println("Text entered = "+myString);

        //closing the scanner object
        input.close();
    }
}
