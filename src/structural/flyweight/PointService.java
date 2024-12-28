package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private final PointIconFactory pointIconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.pointIconFactory = iconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        var point = new Point(1, 2, pointIconFactory.getPointIcon(PointType.CAFE));
        points.add(point);
        return points;
    }
}
