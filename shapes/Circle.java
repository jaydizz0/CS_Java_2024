package shapes;
public class Circle {
    double radius;

    // constructor to initilize class 
    Circle(double radius){
        this.radius = radius;
    }

    // returns the area of a circle 
    double getArea(){
        return (radius*radius)*3.14;
    }
}
