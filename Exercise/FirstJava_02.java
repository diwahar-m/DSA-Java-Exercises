package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstJava_02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // even or odd
//        System.out.println("Please Enter NUmber: ");
//        int number = in.nextInt();
//        if(number % 2 == 0) {
//            System.out.println("It's a Even Number");
//        }else{
//            System.out.println("It's a Odd Number");
//        }

        // greeting message
//        System.out.println("Enter your name");
//        String name = in.next();
//        System.out.println("Welcome, "+ name);

        // Simple Interest
//        System.out.println("Please enter Principla, Time , Rate: ")
//        int principle = in.nextInt();
//        int time = in.nextInt();
//        int rate = in.nextInt();
//        System.out.println(principle * time * rate);

        // calculator
//        System.out.println("Give 2 numbers and operator");
//        int num_1 = in.nextInt();
//        int num_2 = in.nextInt();
//        String operator = in.next();
//        int final_value = 0;
//        switch(operator){
//            case "+":
//                final_value = num_1 + num_2;
//                break;
//            case "-":
//                final_value = num_1-num_2;
//                break;
//            case "*":
//                final_value = num_1 * num_2;
//                break;
//            case "/":
//                final_value = num_1/num_2;
//                break;
//            default:
//                System.out.println("Please check your input");
//        }
//        System.out.println(final_value);

        // largest of 2 numbers
//        System.out.println("Please enter 2 numbers");
//        int number_1 = in.nextInt();
//        int number_2 = in.nextInt();
//        if(number_1 > number_2){
//            System.out.println(number_1);
//        }else{
//            System.out.println(number_2);
//        }

        // Rupee to Dollar
//        System.out.println("Please give rupee");
//        int rupee = in.nextInt();
//        int dollar =(int)( rupee/83.33);
//        System.out.println(dollar);

        // fibonacci sequence
//        System.out.println("Please enter nth number of fibonacci");
//        int fibonacci_n = in.nextInt();
//        int f_1 = 0;
//        int f_2 = 1;
//        if(fibonacci_n == 0){
//            System.out.println("Minimum value will be 1");
//        }
//        else if(fibonacci_n == 1){
//            System.out.println(f_1);
//        }
//        else if(fibonacci_n == 2){
//            System.out.println(f_2);
//        }else{
//            int rounds = fibonacci_n - 1;
//            for(int i = 1; i < rounds; i++){
//                int temp = f_2;
//                f_2 = f_1 + f_2;
//                f_1 = temp;
//            }
//            System.out.println(f_2);
//        }

        // whether string is palindrome
//        System.out.println("Enter a string to find palindrome");
//        String palindrome = in.next();
//        String reversed = "";
//        int last_index = palindrome.length()-1;
//        while(last_index >= 0){
//            reversed = reversed + palindrome.charAt(last_index);
//            last_index--;
//        }
//        if(palindrome.equals(reversed)){
//            System.out.println("Given String is a palindrome");
//        }else{
//            System.out.println("Given string is not a palindrome");
//        }

        // Armstrong number between 2 numbers;
        System.out.println("Please give 2 numbers to find armstrong numbers in between");
        int arms_start = in.nextInt();
        int arms_end = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>(10);
        for(int i = arms_start; i <= arms_end; i++){
            String numString = Integer.toString(i);
            int length = numString.length();
            int total =0;
            int rounds =0;
            while(rounds < length){
                char stringDigit = numString.charAt(rounds);
                //int digit = (int)(stringDigit);  // int converts char to unicode.
                // Correct conversion from char to int
                int digit = Character.getNumericValue(stringDigit);
                int power =(int)(Math.pow(digit, length));
                total = total + power;
                rounds++;
            }
            if(total == i) {
                array.add(i);
            }
        }
         System.out.println(array);
    }
}
