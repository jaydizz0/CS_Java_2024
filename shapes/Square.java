package shapes;
public class Square {
    double length;
    // constructor to initilize class 
    Square(double length){
        this.length = length;
    }

    // returns the area of a square
    double getArea(){
        return length * length;
    }
}
