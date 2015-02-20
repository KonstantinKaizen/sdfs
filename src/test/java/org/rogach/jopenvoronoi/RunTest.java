package org.rogach.jopenvoronoi;

import org.junit.Test;
import org.junit.Ignore;

public class RunTest {

    @Test
    public void parallelyPolygon() {
        try {
            VoronoiDiagram vd = new VoronoiDiagram();

            Vertex v1 = vd.insert_point_site(new Point(0.15907424869091413, -0.22755592000227737));
            Vertex v2 = vd.insert_point_site(new Point(-0.158774429631718, -0.22755592000227737));
            Vertex v3 = vd.insert_point_site(new Point(-0.158774429631718, 0.5000000000000007));
            Vertex v4 = vd.insert_point_site(new Point(-0.44085019690616734, 0.5000000000000007));
            Vertex v5 = vd.insert_point_site(new Point(-0.44085019690616734, -0.4999999999999993));
            Vertex v6 = vd.insert_point_site(new Point(0.44085019690616595, -0.4999999999999993));
            Vertex v7 = vd.insert_point_site(new Point(0.44085019690616595, 0.4999999999999993));
            Vertex v8 = vd.insert_point_site(new Point(0.15907424869091413, 0.4999999999999993));

            vd.insert_line_site(v1, v2);
            vd.insert_line_site(v2, v3);
            vd.insert_line_site(v3, v4);
            vd.insert_line_site(v4, v5);
            vd.insert_line_site(v5, v6);
            vd.insert_line_site(v6, v7);
            vd.insert_line_site(v7, v8);
            vd.insert_line_site(v8, v1);

            vd.check();
        } catch (Throwable t) {
            System.out.println(BugHunter.getFailureName(t));
            throw t;
        }
    }

    @Test
    public void separatorPositioningMinimized() {
        try {
            VoronoiDiagram vd = new VoronoiDiagram();

            Vertex v1 = vd.insert_point_site(new Point(-0.2567719874411157,-0.4983049800651602));
            Vertex v3 = vd.insert_point_site(new Point(-0.25972854724944455,-0.5143879072702902));
            Vertex v4 = vd.insert_point_site(new Point(-0.34168692840153536,-0.6418861147966213));
            Vertex v5 = vd.insert_point_site(new Point(-0.5288215108461576,0.18480346369654843));
            Vertex v6 = vd.insert_point_site(new Point(-0.35263585687204546,-0.50735692278175));

            vd.insert_line_site(v3, v4);
            vd.insert_line_site(v5, v6);

            vd.check();
        } catch (Throwable t) {
            System.out.println(BugHunter.getFailureName(t));
            throw t;
        }
    }

    @Test
    public void separatorPositioningFull() {
        try {
            VoronoiDiagram vd = new VoronoiDiagram();
            Vertex v1 = vd.insert_point_site(new Point(-0.2567719874411157,-0.4983049800651602));
            Vertex v2 = vd.insert_point_site(new Point(0.12205285479992212,-0.640371712930281));
            Vertex v3 = vd.insert_point_site(new Point(-0.25972854724944455,-0.5143879072702902));
            Vertex v4 = vd.insert_point_site(new Point(-0.34168692840153536,-0.6418861147966213));
            Vertex v5 = vd.insert_point_site(new Point(-0.5288215108461576,0.18480346369654843));
            Vertex v6 = vd.insert_point_site(new Point(-0.35263585687204546,-0.50735692278175));
            Vertex v7 = vd.insert_point_site(new Point(-0.4821854389417177,0.46463421861462373));

            vd.insert_line_site(v1, v2);
            vd.insert_line_site(v2, v3);
            vd.insert_line_site(v3, v4);
            vd.insert_line_site(v4, v5);
            vd.insert_line_site(v5, v6);
            vd.insert_line_site(v6, v7);

            vd.check();
        } catch (Throwable t) {
            System.out.println(BugHunter.getFailureName(t));
            throw t;
        }
    }

}
