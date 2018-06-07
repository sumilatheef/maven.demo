package FIRSTPACKAGE;

public class Rectangle //Area of a rectangle
{
    int length;
    int breadth;

        public void areaRectangle(int length, int breadth)
        {
            this.length=length;
            this.breadth=breadth;
        }
        public void displayArea()
        {
            System.out.println("Area of a rectangle="+this.length*this.breadth);
        }
}
