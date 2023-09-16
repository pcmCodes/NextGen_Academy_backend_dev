package org.week3;

import java.util.Scanner;

public class CalcCylinderVolume {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter radius of cylinder: ");
            double radius = scanner.nextDouble();

            System.out.print("Enter height of cylinder: ");
            double height = scanner.nextDouble();

            double volume = Math.PI * Math.pow(radius, 2) * height;

            System.out.println("Volume of Cylinder: " + volume);
        }
    }


