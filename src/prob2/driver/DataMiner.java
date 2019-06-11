package prob2.driver;

import java.util.Arrays;
import java.util.List;

import prob2.curves.Circle;
import prob2.curves.ClosedCurve;
import prob2.curves.Ellipse;
import prob2.curves.EquilateralTriangle;
import prob2.curves.Rectangle;

public class DataMiner
{
    public static void main(String[] args) {
        ClosedCurve eTriange = new EquilateralTriangle(10.0);
        ClosedCurve ellipse = new Ellipse(7.0, 10.0);
        System.out.println("Perimimeter of give Triange: " + eTriange.computePerimeter());      // expects 3*10*10
        System.out.println("Perimimeter of give ellipse: " + ellipse.computePerimeter());       // expects 4*7*10
        
        List<ClosedCurve> curves = Arrays.asList(new EquilateralTriangle(10.0),
            new Ellipse(7.0, 10.0), new Circle(12.0), new Rectangle(10.0, 10.0));
        curves.forEach(curve->
        System.out.println("Perimimeter of this " + curve.getClass().getSimpleName() + " is: " + curve.computePerimeter()));
    }
}
