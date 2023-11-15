package org.example;

// This class is a concrete implementation of the IOperateCar interface
// for a specific car - a BMW760i.
// It is often called a "Concrete" class for this reason.
//
// This is the code that would be written by the BMW Software Engineers
// specifically for controlling the electronic/mechanical parts of a BMW760i.
// All methods in the interface are implemented, thus allowing the
// OperateCarClient component to control the car by calling the  methods
// defined in the IOperateCar interface.
//
// The software would be installed in the car's computer, and then
// the remote driving system could make calls to this software
// using the methods defined by the interface.

public class OperateBMW760I implements IOperateCar {

    // the IOperateCar method signatures, with implementation --
    // for example:
    public int signalTurn(Direction direction, boolean signalOn) {
        // code to turn BMW's LEFT turn indicator lights on
        // code to turn BMW's LEFT turn indicator lights off
        // code to turn BMW's RIGHT turn indicator lights on
        // code to turn BMW's RIGHT turn indicator lights off
        System.out.println(getClass().getName() + " is signalling to turn RIGHT" );
        return 0;
    }

    @Override
    public int turn(Direction direction, double radius, double startSpeed, double endSpeed) {
        // code to signal the electronics/mechanical devices to make the car tur in the direction specified.


        return 0;
    }

    @Override
    public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
        System.out.println(getClass().getName() + " is changing lanes to " + direction.toString() );
        return 0;
    }



    @Override
    public int getRadarFront(double distanceToCar, double speedOfCar) {
        return 0;
    }

    @Override
    public int getRadarRear(double distanceToCar, double speedOfCar) {
        return 0;
    }

    // other members, as needed -- for example, helper classes not
    // visible to clients of the interface
}
