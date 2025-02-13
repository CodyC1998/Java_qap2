public class TestMyRectangle {
    public static void main(String[] args) {
        // create two MyPoint objects 
        MyPoint p1 = new MyPoint(1, 5);  
        MyPoint p2 = new MyPoint(8, 2);  

        // create a MyRectangle object
        MyRectangle rect1 = new MyRectangle(p1, p2);

        // print initial rectangle
        System.out.println("Initial Rectangle:");
        System.out.println(rect1);


        // test getters
        System.out.println("\nTesting Getters:");
        System.out.println("Top-left of rect1: " + rect1.getTopLeft());
        System.out.println("Bottom-right of rect1: " + rect1.getBottomRight());

        // test setters
        System.out.println("\nTesting Setters:");
        rect1.setTopLeft(new MyPoint(0, 6));
        rect1.setBottomRight(new MyPoint(8, 1));
        System.out.println(rect1);

        // test width, height, area, and perimeter
        System.out.println("\nTesting Rectangle Properties:");
        System.out.println("Width of rect1: " + rect1.getWidth());
        System.out.println("Height of rect1: " + rect1.getHeight());
        System.out.println("Area of rect1: " + rect1.getArea());
        System.out.println("Perimeter of rect1: " + rect1.getPerimeter());

        // Final rectangle
        System.out.println("\nFinal Rectangle:");
        System.out.println(rect1);
    }
}
