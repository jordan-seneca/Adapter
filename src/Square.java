/************************************************************************
 *  Compilation:  javac Square.java
 *
 *  This class describes a Square.  The Square class is defined by its
 *  dimension and it is used as an example for Adapter design pattern
 *
 *  This is the ADAPTEE for the Adapter Design Pattern
 ************************************************************************/
public class Square implements Squareable {

    private double width;

    /**
     * Construct a new Square with the specified width
     *
     * @param width the width of the new Square
     */
    public Square(double width) {
        this.width = width;
    }

    /**
     * Get the width of this Square
     *
     * @return the width of this Square.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Get the area of this Square.
     *
     * @return the area of this Square.
     */
    public double squareArea() {
        return width * width;
    }

    /**
     * @return the Square printable format as a string
     */
    @Override
    public String toString() {
        return "Square width=" + width;
    }
}
