package com.infogalaxy.model;

import com.infogalaxy.collector.Circle_Area_Calculator;
import com.infogalaxy.collector.Rectangle_Area_Calculator;
import com.infogalaxy.collector.Triangle_Area_Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle_Area_Calculator circle_area_calculator = new Circle_Area_Calculator();
        Triangle_Area_Calculator triangle_area_calculator = new Triangle_Area_Calculator();
        Rectangle_Area_Calculator rectangle_area_calculator = new Rectangle_Area_Calculator();
        System.out.println("1:Area of Circle");
        System.out.println("2:Area of Triangle");
        System.out.println("3:Area of Rectangle");
        int n=scanner.nextInt();
        switch (n){
            case 1:
                circle_area_calculator.Shape_Area_Calculator();
                break;
            case 2:
                triangle_area_calculator.Shape_Area_Calculator();
                break;
            case 3:
                rectangle_area_calculator.Shape_Area_Calculator();
        }
    }
}
