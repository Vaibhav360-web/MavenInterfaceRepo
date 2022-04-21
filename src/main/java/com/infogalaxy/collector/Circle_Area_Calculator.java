package com.infogalaxy.collector;

import com.infogalaxy.dao.Circle_ShapeDAO;
import com.infogalaxy.service.Constant_Calculation_Value;

import java.util.Scanner;

public class Circle_Area_Calculator implements Constant_Calculation_Value {
    Circle_ShapeDAO circle_shapeDAO = new Circle_ShapeDAO();
    Scanner scanner = new Scanner(System.in);
    @Override
    public double Shape_Area_Calculator() {
        System.out.println("Enter the Radius");
        circle_shapeDAO.setRadius(scanner.nextDouble());
        System.out.println("Area of Circle is:"+Math.floor(pi*circle_shapeDAO.getRadius()*circle_shapeDAO.getRadius()));
        return 0;
    }
}
