package org.adoptopenjdk.lambda.tutorial.exercise1;

import java.util.List;

/**
 * A collection of functions which should be filled out to make tests pass.
 *
 * Each method should use a single call to shapes.forEach.
 *
 * Lambda Tutorial -- Adopt Open JDK
 * @author Graham Allan grundlefleck at gmail dot com
 */
public class Shapes {

    /**
     * Changes the color of all the given <code>shapes</code>, setting to <code>newColor</code>.
     *
     * Example:
     *   given a list containing [BLUE shape, GREEN shape, BLACK shape]
     *   when this method is called with that list and the color RED
     *   then the list will contain [RED shape, RED shape, RED shape]
     *
     * @see Shape#setColor(Color)
     */
    public static void colorAll(List<Shape> shapes, Color newColor) {
        // [your code here]
    }

    /**
     * Creates a String representation of all the given <code>shapes</code>, appending to the given
     * <code>stringBuilder</code>.
     *
     * Uses Shape#toString to create the String representation of each shape.
     *
     * Example:
     *   given a list containing [BLUE shape, GREEN shape, BLACK shape]
     *   when this method is called with that list and an empty StringBuilder
     *   then the StringBuilder's toString method will return "[a BLUE shape][a GREEN shape][a BLACK shape]"
     *
     * @see Shape#toString()
     */
    public static void makeStringOfAllColors(List<Shape> shapes, StringBuilder stringBuilder) {
        // [your code here]
    }

    /**
     * Changes the color of each given shape to newColor, appending a String representation of the color of all the
     * shapes, as they were before they were changed.
     *
     * Example:
     *   given a list containing [BLUE shape, GREEN shape, BLACK shape]
     *   when this method is called with that list, the color RED, and an empty StringBuilder
     *   then the list will contain [RED shape, RED shape, RED shape]
     *     and the StringBuilder's toString method will return "[a BLUE shape][a GREEN shape][a BLACK shape]"
     *
     * This operation is performed in one pass over the <code>shapes</code> List. Note that syntactically a 
     * lambda is similar toan ordinary Java code block. Therefore multiple statements separated by ; are 
     * perfectly legal e.g. <code> (x -> { x.doSomething(); y.doSomethingElse(); });</code> 
     *
     * @see Shape#setColor(Color)
     * @see Shape#toString()
     */
    public static void changeColorAndMakeStringOfOldColors(List<Shape> shapes, Color newColor, StringBuilder stringBuilder) {
        // [your code here]
    }
}
