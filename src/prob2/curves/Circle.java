package prob2.curves;

public class Circle implements ClosedCurve
{
    private final Double radius;
    
    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double computePerimeter()
    {
        return 2*Math.PI*radius*radius;
    }

    public Double getRadius()
    {
        return radius;
    }
    
}
    
    
