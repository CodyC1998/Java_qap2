public class TestMyRectangle {
    public static void main(String[] args) {
        // Create two MyPoint objects for testing
        MyPoint p1 = new MyPoint(1, 5);  // Top-left
        MyPoint p2 = new MyPoint(8, 2);  // Bottom-right

        // Create a MyRectangle object using two MyPoint objects
        MyRectangle rect1 = new MyRectangle(p1, p2);

        // Print initial rectangles
        System.out.println("Initial Rectangles:");
        System.out.println(rect1);


        // Test Getters
        System.out.println("\nTesting Getters:");
        System.out.println("Top-left of rect1: " + rect1.getTopLeft());
        System.out.println("Bottom-right of rect1: " + rect1.getBottomRight());

        // Test Setters
        System.out.println("\nTesting Setters:");
        rect1.setTopLeft(new MyPoint(0, 6));
        rect1.setBottomRight(new MyPoint(8, 1));
        System.out.println(rect1);

        // Test Width, Height, Area, and Perimeter
        System.out.println("\nTesting Rectangle Properties:");
        System.out.println("Width of rect1: " + rect1.getWidth());
        System.out.println("Height of rect1: " + rect1.getHeight());
        System.out.println("Area of rect1: " + rect1.getArea());
        System.out.println("Perimeter of rect1: " + rect1.getPerimeter());

        // Final state of rectangles
        System.out.println("\nFinal Rectangle:");
        System.out.println(rect1);
    }
}
