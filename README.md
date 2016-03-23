Vehicles prepare template method pattern
========================================

An implementation of the template method pattern as applied to an application involving vehicles and their preparation.  The abstract
parent class Vehicle has a prepare() method.  This method acts to get the vehicle ready and calls several other methods.  The wash() 
and unlock() methods are declared in the parent class and are final to prevent them from being overridden.  The examine() and powerOn()
methods are abstract and must be declared in the child classes.  The fuelUp(), checkEngine() and getLaunchPermission() methods are all 
stubs and can be implemented by the child classes or not as required.  The parent class holds the complete prepare method with it's 
algorithm.  This is basic practice with the template method pattern.

![UML diagram of project](https://github.com/cugamer/dp_template_method_vehicles/blob/master/dp_template_method_vehicles/dp_template_method_vehicles.png)
