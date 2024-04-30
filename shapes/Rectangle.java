package shapes;
public class Rectangle {
    double length;
    double width;

    // constructor to initilize class 
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    // returns the area of the rectangle 
    double getArea(){
        return length * width;
    }
}
