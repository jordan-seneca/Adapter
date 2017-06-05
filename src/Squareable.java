/************************************************************************
 *  Compilation:  javac Squareable.java
 *
 *  Interface to provide the area of a shape of type  square
 *  This is the contract of the Adaptee for the Adapter Design Pattern
 ************************************************************************/

public interface Squareable {
    /**
     * Returns the area of a square
     *
     * @return The area of the square
     */
    double squareArea();
}
