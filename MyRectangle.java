public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // constructors
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // calculate rectangle

    // calculate width (difference in x-coordinates)
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // calculate height (difference in y-coordinates)
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // calculate area (width * height)
    public int getArea() {
        return getWidth() * getHeight();
    }

    // calculate perimeter (2 * (width + height))
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // to string method
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + 
               ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}
