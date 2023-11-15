package org.example;        // Updated: 51 Nov 2023
//
// The Java Tutorials
// Taken from the Interfaces section.
// https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html


public class Main {
    public static void main(String[] args) {
        System.out.println("IOperateCar Interface!");

        // Simulate running the OperateCarClient on a BMW car's computer,
        // having injected (passed a reference to ) the BMW specific
        // control code.
        OperateCarClient operateCarClient1 = new OperateCarClient(new OperateBMW760I());

        // The OperateCarClient will call the methods defined in the IOperateCar interface,
        // which will call the actual implementation of those methods
        // in the OperateBMW760i object.
        operateCarClient1.testOperateCar();

        //TODO
        // See Exercise Sheet based on IOperateCar


    }
}