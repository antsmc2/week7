package prob2.curves;

import java.util.Arrays;

public interface Polygon extends ClosedCurve
{

    @Override
    default public Double computePerimeter()
    {
        return Arrays.asList(getLengths()).stream().mapToDouble(length->Double.valueOf(length)).sum();
    }

    public Double[] getLengths();
}
