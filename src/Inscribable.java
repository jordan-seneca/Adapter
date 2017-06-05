/************************************************************************
 *  Compilation:  javac Inscribabel.java
 *
 *  Interface to calculate the area of a shape of type circle
 *  where the circle is inscribed in a given square
 *
 *  This is the TARGET interface for the Adapter Design Pattern
 ************************************************************************/

public interface Inscribable {
    /**
     * Calculates the area of a circle inscribed in a square
     *
     * @param shape The object of type Squareable
     * @return The area of the circle inscribed in the Square
     */
    double circleArea(Squareable shape);
}

