//package com.company;

public class Main {



    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15,8,17);
        Triangle triangleB = new Triangle(3, 2.598, 3,3,3);

        System.out.println("The area of Triangle A: " + triangleA.findArea());
        System.out.println("The area of Triangle B: " + triangleB.findArea());

        System.out.println("There are " + Triangle.numOfSides + " sides in a triangle");


    }
}
