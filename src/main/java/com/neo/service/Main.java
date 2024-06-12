package com.neo.service;
import java.util.*;
import com.neo.model.Node;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Node<String> root = new Node<>("Root"); // Root node, will contain all divisions

        while (true) {
            System.out.print("Add a division (or type 'exit' to finish): ");
            String division = scanner.nextLine();
            if (division.equalsIgnoreCase("exit")) {
                break;
            }

            Node<String> divisionNode = new Node<>(division);
            root.addChild(divisionNode);

            while (true) {
                System.out.print("  Add a department to " + division + " (or type 'done' if no more departments): ");
                String department = scanner.nextLine();
                if (department.equalsIgnoreCase("done")) {
                    break;
                }

                Node<String> departmentNode = new Node<>(department);
                divisionNode.addChild(departmentNode);

                while (true) {
                    System.out.print("    Add a designation to " + department + " (or type 'done' if no more designations): ");
                    String designation = scanner.nextLine();
                    if (designation.equalsIgnoreCase("done")) {
                        break;
                    }

                    Node<String> designationNode = new Node<>(designation);
                    departmentNode.addChild(designationNode);
                }
            }
        }

        System.out.println("Entered details:");
        root.print("");
    }
}