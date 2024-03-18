package lesson28;

public class OuterAndInnerClass {
    private String field = "field";

    private void printText() {
        System.out.println("private method print Text.");
    }

    public void useInnerClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.getField());
        innerClass.innerPrintText();
    }

    private class InnerClass {
        private String getField() {
            return field;
        }

        private void innerPrintText() {
            printText();
        }
    }
}
