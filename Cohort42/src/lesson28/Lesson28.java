package lesson28;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #28
 *
 * @author Alexander Germanow
 * @version 18-Mar-24
 */

public class Lesson28 {
    public static void main(String[] args) {
        OuterAndInnerClass outerAndInnerClass = new OuterAndInnerClass();
        outerAndInnerClass.useInnerClass();

        OuterAndInnerStaticClass outerAndInnerStaticClass = new OuterAndInnerStaticClass();
        outerAndInnerStaticClass.useInnerClass();

        OuterAndInnerStaticClass.InnerClass innerClass = new OuterAndInnerStaticClass.InnerClass();

        //OuterAndInnerClass.InnerClass innerClass = new OuterAndInnerClass().InnerClass();

    }
}
