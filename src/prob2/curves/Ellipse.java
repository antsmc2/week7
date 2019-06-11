package prob2.curves;

public class Ellipse implements ClosedCurve
{
    private final Double semiMajorAxis;
    
    private final Double ellipIntegralAtEccentricity;
    
    public Ellipse(Double semiMajorAxis, Double ellipIntegralAtEccentricity) {
        this.semiMajorAxis = semiMajorAxis;
        this.ellipIntegralAtEccentricity = ellipIntegralAtEccentricity;
    }

    @Override
    public Double computePerimeter()
    {
        return 4*semiMajorAxis*ellipIntegralAtEccentricity;
    }

    public Double getSemiMajorAxis()
    {
        return semiMajorAxis;
    }

    public Double getEllipIntegralAtEccentricity()
    {
        return ellipIntegralAtEccentricity;
    }

    
}
    
    
