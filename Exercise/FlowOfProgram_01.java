package Exercise;

import java.util.Scanner;

public class FlowOfProgram_01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // checking leap year
//        int year = in.nextInt();
//        if(year % 4 ==0 && year % 100 != 0){
//            System.out.println(year + " is a leap year");
//        }else {
//            System.out.println(year + " is not a leap year");
//        }

        // sum of 2 numbers
//        int num1 = in.nextInt();
//        int num2  = in.nextInt();
//        System.out.println(num1+num2);
//
//        // multiplication table for num
//        int number = in.nextInt();
//        for(int i = 1; i <= 10; i++){
//            System.out.println(number + " * "+ i +" = "+ number*i);
//        }

        // lcm
//        int n1 = in.nextInt() ;
//        int n2 = in.nextInt();
//        int lcm = n1>n2 ? n1 : n2 ;
//        while(true){
//            if(lcm % n1 == 0 && lcm % n2 == 0){
//                break;
//            }
//            lcm++;
//        }
//        System.out.println(lcm);

        // hcf
//        int num_1 = in.nextInt();
//        int num_2 = in.nextInt();
//        int hcf = num_1< num_2 ? num_1 : num_2;
//        while(true){
//            if(num_1 % hcf == 0 && num_2 % hcf == 0){
//                break;
//            }
//            hcf--;
//        }
//        System.out.println(hcf);

        // sum of numbers till user enters 'x'.
        int sum = 0;
        while(true){
            String user_input = in.next();
            if(user_input.equals("x")){
                break;
            }
            sum += Integer.parseInt(user_input);
        }
        System.out.println(sum);

    }
}
