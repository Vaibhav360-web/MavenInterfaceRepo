package com.infogalaxy.collector;

import com.infogalaxy.dao.Rectangle_ShapeDAO;
import com.infogalaxy.service.Constant_Calculation_Value;

import java.util.Scanner;

public class Rectangle_Area_Calculator implements Constant_Calculation_Value {
    Rectangle_ShapeDAO rectangle_shapeDAO = new Rectangle_ShapeDAO();
    Scanner scanner = new Scanner(System.in);
    @Override
    public double Shape_Area_Calculator() {
        System.out.println("Enter the Base of Rectangle:");
        rectangle_shapeDAO.setLength(scanner.nextDouble());
        System.out.println("Enter the Width of Rectangle:");
        rectangle_shapeDAO.setWidth(scanner.nextDouble());
        System.out.println("The Area of Rectangle is:"+Math.floor(rectangle_shapeDAO.getLength()* rectangle_shapeDAO.getWidth()));
        return 0;
    }
}
