package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1) Define two methods to print the maximum and the minimum number respectively among three numbers .
//        int num_1 = in.nextInt();
//        int num_2 = in.nextInt();
//        int num_3 = in.nextInt();
//        System.out.println("Maximum is " + getMaxNum(num_1,num_2, num_3));
//        System.out.println("Minimum is " + getMinNum(num_1,num_2, num_3));

        // 2) Define a program to find out whether a given number is even or odd
//        int num = in.nextInt();
//        System.out.println(getEvenOrOdd(num));

        // 3) Eligible to vote
//        int age = in.nextInt();
//        System.out.println(getVoteEligibility(age));

        // 4) Sum of Numbers
        // 5) Product of Numbers
//        int num_1 = in.nextInt();
//        int num_2 = in.nextInt();
//        System.out.println(getSumAndProduct(num_1, num_2));

        // 6) Circumference & Area of circle
//        int radius = in.nextInt();
//        System.out.println(getCirAndAreaOfCircle(radius));

        // 7) Number is prime or not
//        int num = in.nextInt();
//        System.out.println(isPrime(num));

        // 8) Display grade for marks
//        int mark = in.nextInt();
//        System.out.println(getGradeForMarks(mark));

        // 9) Factorial
//        int num = in.nextInt();
//        System.out.println(getFactorial(num));

        // 10) Palindrome or not
//        int num = in.nextInt();
//        System.out.println(getPalindrome(num));

        // 12) Pythagorean triplet
//        String arrInput = in.nextLine();
//        String[] arr = arrInput.split(" ");
//        int[] intArr = new int[arr.length];
//        for(int i = 0; i < arr.length ; i++){
//            intArr[i] = Integer.parseInt(arr[i]);
//        }
//        System.out.println(getPythagoreanTriplet(intArr));

        // 13) Prime number between 2 numbers
//        String input = in.nextLine();
//        String[] strArr = input.split(" ");
//        int[] arr = new int[strArr.length];
//        for(int i =0; i< strArr.length; i++){
//            arr[i] = Integer.parseInt(strArr[i]);
//        }
//        System.out.println(getPrimeBetweenNum(arr[0], arr[1]));

        // 14) Sum of first n natural numbers
//        int num = in.nextInt();
//        System.out.println(getNaturalNumberSum(num));
    }
    // (1)
    static int getMaxNum(int a, int b,int c){
        int max = a;
        if(b > max){
            max = b;
        }else if( c > max){
            max  = c;
        }
        return max;
    }
    static int getMinNum(int a, int b,int c){
        int min = a;
        if(b < min){
            min = b;
        }else if( c < min){
            min  = c;
        }
        return min;
    }
    // (2)
    static String getEvenOrOdd(int a){
        String result = "odd";
        if(a % 2 == 0){
            result = "even";
        }
        return "Given num is "+ result;
    }
    // (3)
    static String getVoteEligibility(int age){
        String result = "not eligible";
        if( age >= 18){
            result = "eligible";
        }
        return "Given person is "+ result + " to vote.";
    }
    // (4) & (5)
    static String getSumAndProduct(int num_1, int num_2){
        return "Sum is "+ (num_1+num_2) + " & Product is "+ num_1*num_2;
    }
    // (6)
    static String getCirAndAreaOfCircle(int radius){
        return "The Circumference is "+ (2 * 3.14 * radius) + " & Area is "+(3.14 * Math.pow(radius, 2));
    }
    // (7)
    static String isPrime(int num){
        if(num == 0 || num == 1){
            return "Given number is not a prime";
        }
        int c = 2;
        while(c * c < num){
            if(num % c == 0){
                return "Given number is not a prime";
            }
            c++;
        }
        return "Given number is a prime";
    }
    // (8)
    static String getGradeForMarks(int mark){
        if(mark > 90) return "AA";
        else if(mark > 80) return "AB";
        else if(mark > 70) return "BB";
        else if(mark > 60) return "BC";
        else if(mark > 50) return "CD";
        else if(mark > 40) return "DD";
        return "Fail";
    }
    // (9)
    static String getFactorial(int num){
        int result = 1;
        while (num > 0) {
            result *= num;
            num--;
        }
        return "Factorial of a number is "+ result;
    }
    // (10)
    static String getPalindrome(int num){
        int givenNum = num;
        int reversedNum =0;
        while(num > 0){
            int rem = num % 10;
            reversedNum = reversedNum * 10 + rem;
            num /= 10;
        }
        return "Palindrome is "+ (givenNum == reversedNum);
    }
    // (12)
    static Boolean getPythagoreanTriplet(int[] arr){
        double num_1 = Math.pow(arr[0], 2);
        double num_2 = Math.pow(arr[1], 2);
        double num_3 = Math.pow(arr[2], 2);
        double result = num_1 + num_2;
        return (result == num_3);
    }

    static String getPrimeBetweenNum(int num_1, int num_2){
        StringBuilder result= new StringBuilder();
        while(num_1 < num_2){
            int c = 2;
            while( c*c < num_1){
                if(num_1 % c == 0) {
                    break;
                }
                c++;

            }
            if(c*c > num_1){
                result = new StringBuilder(result + Integer.toString(num_1) + " ");
            }
            num_1++;
        }
        return result.toString();

    }

    static Integer getNaturalNumberSum(int num){
        int result=0;
        while(num > 0){
            result += num;
            num--;
        }
        return result;
    }

}
