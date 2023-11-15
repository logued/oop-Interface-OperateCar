package org.example;

// This component (object) is installed on the Car computer and, when running, it receives
// instructions from a remote server via 5G and some telecommunications software. (notionally)
//
// Its job is to take instructions from the remote server, and then to pass
// those instructions to the concrete class operating this specific car (e.g. BMW).
// Notice that this software is not dependent on the IOperateBMW760I class, but is
// instead dependent on the IOperateCar interface.
// This means that this client can operate any type of Car, and can be installed
// on all car types. The car-specific control class is passed into this class
// as a reference type.

// Users of this class are required to

public class OperateCarClient {

    IOperateCar carOperator;

    // Inject a concrete IOperateCar object for a specific car type into
    // this client car operator object.
    // (example of Dependency Injection pattern)
    // This OperateCarClient depends only on the IOperateCar interface.
    // i.e. It uses references of that type, and only calls methods
    // that are specified in that interface.
    //

    /**
     * @param carOperator - An object that must implement the IOperateCar interface.
     */
    OperateCarClient(IOperateCar carOperator) {
        this.carOperator = carOperator;
    }

    public void testOperateCar(){

        // To control the car this client calls methods that are defined in the
        // IOperateCar interface.  The interface defines the methods that are required
        // by the contract, and the concrete class (eg BMW specific class will have
        // implemented those methods.

        carOperator.signalTurn(Direction.RIGHT,true)    ;

        carOperator.changeLanes(Direction.RIGHT,60.5,70.3);

        // and so on......
        //
        // The client software would receive signals from the remote controller and
        // would make calls to the car control software to enact those control signals.

    }

}
