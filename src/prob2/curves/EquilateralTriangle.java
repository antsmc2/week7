package prob2.curves;

public class EquilateralTriangle implements Polygon
{
    private final Double side;
    
    public EquilateralTriangle(Double side) {
        this.side = side;
    }
    
    @Override
    public Double[] getLengths() {
        return new Double[] {side, side, side};
    }

    public Double getSide()
    {
        return side;
    }
}
