public class TestMyLine {
    public static void main(String[] args) {
        // Create two MyPoint objects
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Create a MyLine object using MyPoint 
        MyLine line1 = new MyLine(p1, p2);

        // Create another MyLine (x1, y1, x2, y2)
        MyLine line2 = new MyLine(2, 3, 5, 7);

        // Print initial lines
        System.out.println("Initial Lines:");
        System.out.println(line1);
        System.out.println(line2);

        // Test Getters
        System.out.println("\nTesting Getters:");
        System.out.println("Begin Point of line1: " + line1.getBegin());
        System.out.println("End Point of line1: " + line1.getEnd());
        System.out.println("Begin X of line2: " + line2.getBeginX());
        System.out.println("Begin Y of line2: " + line2.getBeginY());
        System.out.println("End X of line2: " + line2.getEndX());
        System.out.println("End Y of line2: " + line2.getEndY());

        // Test Setters
        System.out.println("\nTesting Setters:");
        line1.setBegin(new MyPoint(0, 0));
        line1.setEnd(new MyPoint(3, 4));
        line2.setBeginX(1);
        line2.setEndX(4);
        line2.setBeginY(2);
        line2.setEndY(6);
        System.out.println("After modification:");
        System.out.println(line1);
        System.out.println(line2);

        // Test Length and Gradient
        System.out.println("\nTesting Length and Gradient:");
        System.out.println("Length of line1: " + line1.getLength());
        System.out.println("Gradient of line1: " + line1.getGradient());
        System.out.println("Length of line2: " + line2.getLength());
        System.out.println("Gradient of line2: " + line2.getGradient());

        // Final state of lines
        System.out.println("\nFinal State of Lines:");
        System.out.println(line1);
        System.out.println(line2);
    }
}
