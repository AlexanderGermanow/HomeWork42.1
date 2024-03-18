package lesson27;

import lesson22.Rectangle;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #19
 *
 * @author Alexander Germanow
 * @version 04-Mar-24
 */
public class Lesson27 {
    public static void main(String[] args) {
        // #1
        Figure[] figures = {new Circle(5), new Rectangle(), new Triangle(4, 5, 3)};
        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName());
            System.out.println(figure.calcArea());
            System.out.println(figure.calcPerimeter());
        }
    }
}
