package org.week3;

import java.util.Scanner;

public class CalcNetPayableSalary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Type in basic salary: ");
            double basicSalary = scanner.nextDouble();

            double hra = 0.5 * basicSalary;
            double specialAllowance = 0.75 * basicSalary;
            double pfDeduction = 0.12 * basicSalary;

            double netPayableSalary = (basicSalary + hra + specialAllowance) - pfDeduction;

            System.out.println("Net Payable Salary: " + netPayableSalary);
        }
    }

