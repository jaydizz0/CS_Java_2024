package shapes;
import java.util.*;
public class greatestArea {
    public static void main(String[] args){

        // Values for areas of different shapes which are stored in an array 
        ArrayList<Double> squareAreaArray = new ArrayList<Double>();
        ArrayList<Double> circleAreaArray = new ArrayList<Double>();
        ArrayList<Double> rectangleAreaArray = new ArrayList<Double>();
        ArrayList<Double> triangleAreaArray = new ArrayList<Double>();
        
        // Shape HashMap that identify the type of shape with a string key 
        HashMap<String, ArrayList<Double>> shapeMap = new HashMap<>();
        shapeMap.put("Square", squareAreaArray);
        shapeMap.put("Circle", circleAreaArray);
        shapeMap.put("Rectangle", rectangleAreaArray);
        shapeMap.put("Triangle", triangleAreaArray);

        // Shape objects
        Square s = new Square(10);
        Square s2 = new Square(15);
        Circle c = new Circle(5.6419);
        Circle c2 = new Circle(7);
        Rectangle r = new Rectangle(5,45);
        Triangle t = new Triangle(0,0,15,0,0,30);
        Triangle t2 = new Triangle(0,0,15,0,0,30);
        
        // getting areas of shape objects
        double squareArea = s.getArea();
        double circleArea = c.getArea();
        double circleArea2 = c2.getArea();
        double rectangleArea = r.getArea();
        double triangleArea = t.getArea();
        double triangleArea2 = t2.getArea();
        double squareArea2 = s2.getArea();


        // add areas of shape objects to array lists
        squareAreaArray.add(squareArea);
        rectangleAreaArray.add(rectangleArea);
        circleAreaArray.add(circleArea);
        triangleAreaArray.add(triangleArea);
        triangleAreaArray.add(triangleArea2);
        squareAreaArray.add(squareArea2);
        circleAreaArray.add(circleArea2);

        
        // sort each array from highest to lowest 
        Collections.sort(squareAreaArray, Collections.reverseOrder());
        Collections.sort(circleAreaArray, Collections.reverseOrder());
        Collections.sort(rectangleAreaArray, Collections.reverseOrder());
        Collections.sort(triangleAreaArray, Collections.reverseOrder());


        // Find highest number for each shape array
        double highestSquareArea = squareAreaArray.get(0);
        double highestCircleArea = circleAreaArray.get(0);
        double highestRectangleArea = rectangleAreaArray.get(0);
        double highestTriangleArea = triangleAreaArray.get(0);

        
        // Finds the greatest area
        double highestArea = 0;
        if(highestSquareArea > highestArea){
            highestArea = highestSquareArea;
        }
        if(highestCircleArea > highestArea){
            highestArea = highestCircleArea;
        }
        if(highestRectangleArea > highestArea){
            highestArea = highestRectangleArea;
        }
        if(highestTriangleArea > highestArea){
            highestArea = highestTriangleArea;
        }

        /*
         * Looks for the highest area value in each array
         * This also looks for other instances of the highest number appearing
         * in the different shape arrays 
         */
        System.out.println("Greatest Areas:");
        for(Map.Entry<String, ArrayList<Double>> entry : shapeMap.entrySet()){
            if(entry.getValue().contains(highestArea)){
                int temp = 0;
                for(int i = 0; i < entry.getValue().size(); i++){
                    if(entry.getValue().get(i) == highestArea){
                        temp +=1;
                        System.out.println(entry.getKey() + " "+ temp +  ": " + highestArea);
                    }
                    else{
                        temp = 0;
                    }
                }
            }
        }
    }
}




