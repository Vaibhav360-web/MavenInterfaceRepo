package com.infogalaxy.collector;

import com.infogalaxy.dao.Triangle_ShapeDAO;
import com.infogalaxy.service.Constant_Calculation_Value;

import java.util.Scanner;

public class Triangle_Area_Calculator implements Constant_Calculation_Value {
    Triangle_ShapeDAO triangle_shapeDAO = new Triangle_ShapeDAO();
    Scanner scanner = new Scanner(System.in);
    @Override
    public double Shape_Area_Calculator() {
        System.out.println("Enter the Base of Triangle:");
        triangle_shapeDAO.setBase(scanner.nextDouble());
        System.out.println("Enter the Height of Triangle:");
        triangle_shapeDAO.setHeight(scanner.nextDouble());
        System.out.println("Area of Circle is:"+Math.floor(Triangle_Constant*triangle_shapeDAO.getBase()*triangle_shapeDAO.getHeight()));
        return 0;
    }
}
