import java.awt.*;

public class Tetrahedron {

    private MyPolygon[] polygons;
    private Color color;

    Tetrahedron(Color color, MyPolygon... polygons) {
        this.color = color;
        this.polygons = polygons;
        this.setPolygonColor();
    }

    Tetrahedron(MyPolygon... polygons) {
        this.color = Color.WHITE;
        this.polygons = polygons;

    }

    public void render(Graphics g) {
        for (MyPolygon poly : this.polygons) {
            poly.render(g);
        }
    }

    public void rotate(boolean CW, double XDegrees, double YDegrees, double ZDegrees) {
        for (MyPolygon p : this.polygons) {
            p.rotate(CW, XDegrees, YDegrees, ZDegrees);
        }
        this.sortPolygons();
    }

    private void sortPolygons() {
        MyPolygon.sortPolygons(this.polygons);
    }

    private void setPolygonColor() {
        for (MyPolygon poly : this.polygons) {
            poly.setColor(this.color);
        }
    }
}
