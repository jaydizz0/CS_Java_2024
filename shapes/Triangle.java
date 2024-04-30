package shapes;
public class Triangle {
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    // constructor to initilize class 
    Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    // uses heron's formula to determine the area of a triangle given points
    double getArea(){
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);  
    }
}
