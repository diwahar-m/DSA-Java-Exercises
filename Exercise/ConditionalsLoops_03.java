package Exercise;

import java.util.Scanner;

public class ConditionalsLoops_03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Area of circle
//        int circle_radius = in.nextInt();
//        double area_of_circle = 3.142 * circle_radius * circle_radius;
//        System.out.println(area_of_circle);

        // Area of triangle
//        int triangle_breadth = in.nextInt();
//        int triangle_height = in.nextInt();
//        double area_of_triangle = 0.5 * triangle_breadth * triangle_height;
//        System.out.println(area_of_triangle);

        // area of rectangle
//        int rectangle_breadth = in.nextInt();
//        int rectangle_height = in.nextInt();
//        double area_of_rectangle = rectangle_breadth * rectangle_height;
//        System.out.println(area_of_rectangle);

        // Area of Isosceles Triangle
//        int iso_side_a = in.nextInt();
//        int iso_side_b = in.nextInt();
//        double area_of_isosceles_triangle = 0.4 * (iso_side_b * ( Math.pow( 4*(Math.pow(iso_side_a, 2)) - Math.pow(iso_side_b, 2) , 0.5) ));
//        System.out.println(area_of_isosceles_triangle);

        // Area of parallelogram
//        int parallelogram_breadth = in.nextInt();
//        int parallelogram_height = in.nextInt();
//        double area_of_parallelogram = parallelogram_breadth * parallelogram_height;
//        System.out.println(area_of_parallelogram);

        // Area of rhombus
//        int rhombus_breadth = in.nextInt();
//        int rhombus_height = in.nextInt();
//        double area_of_rhombus = rhombus_breadth * rhombus_height;
//        System.out.println(area_of_rhombus);

        // Area of equilateral triangle
//        int equilateral_triangle_side = in.nextInt();
//        double  area_of_equilateral_triangle = Math.pow(3, 0.5) * Math.pow(equilateral_triangle_side, 2) / 4;
//        System.out.println(area_of_equilateral_triangle);

        // Perimeter of circle
//        int perimeter_circle_radius = in.nextInt();
//        double perimeter_of_circle = 2*3.14*perimeter_circle_radius;
//        System.out.println(perimeter_of_circle);

        // Perimeter of equilateral triangle
//        int perimeter_equilateral_triangle_side = in.nextInt();
//        double perimeter_of_equilateral_triangle = 3 * perimeter_equilateral_triangle_side;
//        System.out.println(perimeter_of_equilateral_triangle);

        // Perimeter of parallelogram
//        int perimeter_parallelogram_side_a = in.nextInt();
//        int perimeter_parallelogram_side_b = in.nextInt();
//        double perimeter_of_parallelogram = 2 * ( perimeter_parallelogram_side_a + perimeter_parallelogram_side_b);
//        System.out.println(perimeter_of_parallelogram);

        // Perimeter of rectangle
//        int perimeter_rectangle_width = in.nextInt();
//        int perimeter_rectangle_length = in.nextInt();
//        double perimeter_of_rectangle = 2 * ( perimeter_rectangle_width + perimeter_rectangle_length);
//        System.out.println(perimeter_of_rectangle);

        // Perimeter of square
//        int perimeter_square_side_a = in.nextInt();
//        double perimeter_of_square = 4 * perimeter_square_side_a;
//        System.out.println(perimeter_of_square);

        // Perimeter of rhombus
//        int perimeter_rhombus_side_a = in.nextInt();
//        double perimeter_of_rhombus = 4 * perimeter_rhombus_side_a;
//        System.out.println(perimeter_of_rhombus);

        // Volume of Cone
//        int volume_cone_height = in.nextInt();
//        int volume_cone_radius = in.nextInt();
//        double volume_of_cone = (1/3) * 2* 3.14 * volume_cone_radius * volume_cone_height;
//        System.out.println(volume_of_cone);

        // Volume of prism
//        int volume_prism_base = in.nextInt();
//        int volume_prism_height = in.nextInt();
//        double volume_of_prism = volume_prism_base * volume_prism_height;
//        System.out.println(volume_of_prism);

        // Volume of cylinder
//        int volume_cylinder_height = in.nextInt();
//        int volume_cylinder_radius = in.nextInt();
//        double volume_of_cylinder = 2* 3.14 * volume_cylinder_radius * volume_cylinder_height;
//        System.out.println(volume_of_cylinder);

        // Volume of sphere
//        int volume_sphere_radius = in.nextInt();
//        double volume_of_sphere = (4/3)* 3.14 * Math.pow(volume_sphere_radius, 3);
//        System.out.println(volume_of_sphere);

        // Volume of pyramid
//        int volume_pyramid_base = in.nextInt();
//        int volume_pyramid_height = in.nextInt();
//        double volume_of_pyramid = (0.333) * volume_pyramid_base * volume_pyramid_height;
//        System.out.println(volume_of_pyramid);

        // Curves Surface Area of Cylinder
//         int csa_cylinder_radius = in.nextInt();
//         int csa_cylinder_height = in.nextInt();
//         double curved_surface_area_of_cylinder = 2 * 3.14 * csa_cylinder_radius * csa_cylinder_height;
//         System.out.println(curved_surface_area_of_cylinder);

         // Total surface area of cube
//        int tsa_cube_side = in.nextInt();
//        double total_surface_area_of_cube = 6 * Math.pow(tsa_cube_side, 2);
//        System.out.println(total_surface_area_of_cube);

        // Fibonacci series of nth num;
//        int fibonacci_nth_number = in.nextInt();
//        int fibo_n1 = 0;
//        int fibo_n2 = 1;
//        if(fibonacci_nth_number == 1){
//            System.out.println(fibo_n1);
//        }else if(fibonacci_nth_number == 2){
//            System.out.println(fibo_n2);
//        }else{
//            int count = 1;
//            while(count < fibonacci_nth_number - 1){
//                int temp = fibo_n2;
//                fibo_n2 = fibo_n1 + fibo_n2;
//                fibo_n1 = temp;
//                count++;
//            }
//            System.out.println(fibo_n2);
//        }

        // (23) Factors of number
//        int factor_number = in.nextInt();
//        int factor = 1;
//        while(factor < factor_number){
//            if(factor_number % factor == 0){
//                System.out.println(factor);
//            }
//            factor++;
//        }

        // (24) sum of numbers till user enters 0;
//        int sum_of_number = 0;
//        while(true){
//            int user_input = in.nextInt();
//            if(user_input == 0){
//                break;
//            }else{
//                sum_of_number = sum_of_number + user_input;
//            }
//        }
//        System.out.println(sum_of_number);

        // (25) largest of numbers
//        int largest_number = 0;
//        int current_number =0;
//        while(true){
//            int user_input = in.nextInt();
//            current_number = user_input;
//            if(user_input == 0){
//                break;
//            }else{
//                if(current_number > largest_number){
//                    largest_number = current_number;
//                }
//            }
//        }
//        System.out.println(largest_number);

        // (26) Addition of two numbers
        int first_number = in.nextInt();
        int second_number = in.nextInt();
        System.out.println(first_number + second_number);



    }
}
