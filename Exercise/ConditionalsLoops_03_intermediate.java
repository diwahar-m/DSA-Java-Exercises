package Exercise;

import java.util.Scanner;

public class ConditionalsLoops_03_intermediate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // (1) Factorial of a number
//        int factorial_number = in.nextInt();
//        int factorial_result = 1;
//        while (factorial_number > 0) {
//            factorial_result *= factorial_number;
//            factorial_number--;
//        }
//        System.out.println(factorial_result);

        // (2) Calculate Electricity Bill
//        int electricity_unit = in.nextInt();
//        int total_price = 0;
//        if (electricity_unit <= 100) {
//            total_price = electricity_unit * 10;
//        } else if (electricity_unit > 100 && electricity_unit <= 200) {
//            total_price = electricity_unit * 15;
//        } else if (electricity_unit > 200 && electricity_unit <= 300) {
//            total_price = electricity_unit * 20;
//        } else {
//            total_price = electricity_unit * 25;
//        }
//        System.out.println(total_price);

        // (3) Calculate Average Of N Numbers
//        int sum_of_numbers = 0;
//        int count =0;
//        String user_input = in.nextLine();
//        String[] arrayOfNum = user_input.split(" ");
//        for(int i=0; i < arrayOfNum.length; i++){
//            count ++;
//            int number =Integer.parseInt(arrayOfNum[i]);
//            sum_of_numbers += number;
//        }
//        System.out.println(sum_of_numbers / count);


        // (4) Calculate Discount Of Product
//        int market_price = in.nextInt();
//        int selling_price = in.nextInt();
//        float discount_percentage = (selling_price * 100)/market_price;
//        System.out.println(discount_percentage);

        // (5) Calculate Distance Between Two Points
//        System.out.print("Enter x,y of point 1: ");
//        int x1 = in.nextInt();
//        int y1 = in.nextInt();
//        System.out.print("Enter x,y of point 2: ");
//        int x2 = in.nextInt();
//        int y2 = in.nextInt();
//        double x2_x1 = Math.pow(x2 - x1, 2);
//        double y2_y1 = Math.pow(y2 - y1, 2);
//        double distance_bw_2_points = Math.pow( x2_x1 + y2_y1, 0.5);
//        System.out.println(distance_bw_2_points);

        // (6) Calculate Commission Percentage
//        System.out.print("Enter amount & percentage: ");
//        int amount = in.nextInt();
//        int commission_percent = in.nextInt();
//        System.out.println((amount * commission_percent) / 100);

        // (7) Power In Java
//        System.out.print("Enter number & power : ");
//        int number = in.nextInt();
//        int power = in.nextInt();
//        int power_result = 1;
//        while(power > 0){
//            power_result *= number;
//            power--;
//        }
//        System.out.println(power_result);

        // (8)  Calculate Depreciation of Value
//        System.out.println("Enter original value, rate of depreciation,time in years: ");
//        int original_value = in.nextInt();
//        int depreciation_rate = in.nextInt();
//        int year = in.nextInt();
//        while(year > 0){
//            original_value -= (original_value * depreciation_rate)/100;
//            year--;
//        }
//        System.out.println(original_value);

        // (9) Calculate Batting Average
//        System.out.println("Enter Total Scores & Total wickets of player: ");
//        int total_runs = in.nextInt();
//        int total_wickets = in.nextInt();
//        System.out.println(total_runs / total_wickets);

        // (10) Calculate CGPA
//        System.out.println("Enter marks obtained for each semester out of 100: ");
//        String string_marks_array = in.nextLine();
//        String[] marks_array = string_marks_array.split(" ");
//        float marks = 0;
//        for(int i = 0; i < marks_array.length; i++){
//            marks += Integer.parseInt(marks_array[i])/10.0;
//        };
//        System.out.println(marks/ marks_array.length );

        // (11) Compound Interest Java Program
//           System.out.print("Enter principal, rate, time: ");
//           double principal = in.nextDouble();
//           double rate = in.nextDouble();
//           int time = in.nextInt();
//           while( time > 0){
//               principal += ( principal * rate)/100;
//               time--;
//           }
//           System.out.println(principal);

        // (12) Calculate Average Marks
//        System.out.print("Enter your marks to get average: ");
//        String marks_as_string = in.nextLine();
//        String[] marks_as_array = marks_as_string.split(" ");
//        float marks = 0;
//        for(int i =0; i < marks_as_array.length; i++){
//            marks += Integer.parseInt(marks_as_array[i]);
//        }
//        double average_marks = marks/(marks_as_array.length);
//        System.out.println(average_marks);

        // (13) Sum Of N Numbers
//        System.out.print("Enter your marks to get sum: ");
//        String numbers_to_sum = in.nextLine();
//        String[] numbers_for_sum = numbers_to_sum.split(" ");
//        int sum_of_numbers = 0;
//        for(int i =0; i < numbers_for_sum.length; i++){
//            sum_of_numbers += Integer.parseInt(numbers_for_sum[i]);
//        };
//        System.out.println(sum_of_numbers);

        // (14) Armstrong Number In Java
//        System.out.println("Enter number to check armstrong: ");
//        Integer is_armstrong_number = in.nextInt();
//        String armstrong_number = Integer.toString(is_armstrong_number);
//        float final_number = 0;
//        while(true){
//            if(is_armstrong_number == 0){
//                break;
//            }
//            int remainder = is_armstrong_number % 10;
//            final_number += Math.pow(remainder, armstrong_number.length());
//            is_armstrong_number = is_armstrong_number / 10;
//        }
//        System.out.println(final_number);

        // (15) Find Ncr & Npr
        //  Formula => nCr = n! / r! (n - r)!
        //  Formula => nPr = n! / (n - r)!
        // Formula nPr = nCr * r!
//        System.out.println("Enter n and r");
//        int n = in.nextInt();
//        int r = in.nextInt();
//        double nCr = findingFactorial(n) /( findingFactorial(r) * findingFactorial(n-r)) ;
//        double nPr = findingFactorial(n) /  findingFactorial(n-r) ;
//        double nPr_from_nCr = nCr * findingFactorial(r);
//        System.out.println(nCr);
//        System.out.println(nPr);
//        System.out.println(nPr_from_nCr);

        // (16) Reverse A String In Java
//        System.out.println("Enter a string to reverse it: ");
//        String given_string = in.next();
//        char[] charArray = given_string.toCharArray();
//        String reversedString = "";
//         for(int i= charArray.length -1; i >= 0; i--){
//             reversedString = reversedString + charArray[i];
//         }
//

        // (17) Find if a number is palindrome or not
//        System.out.print("Enter a number to check whether it is a panlindrome");
//        int given_number = in.nextInt();
//        String num_as_string = String.valueOf(given_number);
//        String reversed_num_string ="";
//        while(true){
//            if(given_number == 0){
//                break;
//            }
//            reversed_num_string = reversed_num_string.concat(String.valueOf(given_number%10));
//            given_number /= 10;
//        }
//        System.out.println(reversed_num_string.equals(num_as_string));

        // (18) Future Investment Value
//        System.out.println("Enter amount, interest rate and years: ");
//        double presentValue = in.nextDouble();
//        double interestRate = in.nextDouble();
//        double years = in.nextDouble();
//        double futureValue=presentValue * Math.pow((1+interestRate/100),years);
//        System.out.println(futureValue);

        // (19) HCF Of Two Numbers Program
//        System.out.print("Enter two numbers to get HCF: ");
//        int num_1 = in.nextInt();
//        int num_2 = in.nextInt();
//        int lowest_number = num_1 < num_2 ? num_1 : num_2;
//        while(true){
//            if(num_1 % lowest_number == 0 && num_2 % lowest_number == 0){
//                break;
//            }
//            lowest_number--;
//        }
//        System.out.println(lowest_number);


        // (20) LCM of Two Numbers
//        System.out.println("Enter two numbers to know their LCM: ");
//        int num_1 = in.nextInt();
//        int num_2 = in.nextInt();
//        int largest = num_1 > num_2 ? num_1 : num_2;
//        while(true){
//            if(largest % num_1 == 0 && largest % num_2 == 0){
//                break;
//            }
//            largest++;
//        }
//        System.out.println(largest);

        // (21) Java Program Vowel Or Consonant
//        System.out.print("Enter character to check whether it is vowel or consonant: ");
//        char ch = in.next().charAt(0);
//        if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u'){
//            System.out.print(ch + " is a vowel.");
//        }else {
//            System.out.print(ch + " is a consonant.");
//        }

        // (22) Perfect Number In Java
//        System.out.print("Enter number to check whether it is a perfect number: ");
//        int num = in.nextInt();
//        int initial_num =1;
//        int final_sum = 0;
//        while(initial_num < num){
//            if(num % initial_num == 0){
//                final_sum += initial_num;
//            }
//            initial_num++;
//        }
//        if(final_sum == num){
//            System.out.println(num + " is a perfect number.");
//        }else{
//            System.out.println(num + " is not a perfect number.");
//        }

        // (23) Check Leap Year Or Not
//        System.out.print("Enter a year to check whether it is a leap year or not: ");
//        int year = in.nextInt();
//        if(year % 4 == 0 && year % 100 != 0){
//            System.out.print(year + " is a leap year.");
//        }else{
//            System.out.print(year + " is not a leap year.");
//        }

        // (24) Sum Of A Digits Of Number
//        System.out.print("Enter a number to find sum of it's digits: ");
//        int number = in.nextInt();
//        int num = number;
//        int sum_of_digit=0;
//        while(num > 0){
//            sum_of_digit += num%10;
//            num /= 10;
//        }
//        System.out.print(sum_of_digit + " is a sum of digits of number "+ number);

        // (25) Even days in august month
//        int no_of_even_days =0;
//        for(int i =1; i <= 31; i++){
//            if(i % 2 == 0){
//                no_of_even_days++;
//            }
//        }
//        System.out.print("There are "+no_of_even_days+ " in August month.");

        // (26) sum of negative, odd & even numbers
        String num_string = in.nextLine();
        String[] string_array = num_string.split(" ");
        int sum_of_negative_num = 0 ;
        int sum_of_even_num = 0;
        int sum_of_odd_num = 0;
        int[] num_array = new int[string_array.length];
        for(int i=0; i < string_array.length;i++){
            num_array[i] = Integer.parseInt(string_array[i]);
        }
        for(int j=0; j < num_array.length; j++){
            int num = num_array[j];
            if(num == 0){
                break;
            } else if(num < 0){
                sum_of_negative_num += num;
            }else if(num % 2 == 0){
                sum_of_even_num += num;
            }else{
                sum_of_odd_num += num;
            }
        }
        System.out.println(sum_of_negative_num + " is the sum of negative numbers.");
        System.out.println(sum_of_even_num + " is the sum of even numbers.");
        System.out.println(sum_of_odd_num + " is the sum of odd numbers.");









    }

    static double findingFactorial(int number){
        double factorial_result = 1;
        double factorial_number = number;
        while (factorial_number > 1){
            factorial_result *= factorial_number;
            factorial_number--;
        }
        return factorial_result;
    }


}
