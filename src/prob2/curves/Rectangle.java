package prob2.curves;

public class Rectangle implements Polygon
{
    private final Double width;
    
    private final Double height;
    
    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public Double[] getLengths() {
        return new Double[] {width, height, width, height};
    }

    public Double getWidth()
    {
        return width;
    }

    public Double getHeight()
    {
        return height;
    }
}
