package gr.aueb.cf.ch13mine;

import gr.aueb.cf.ch13mine.model.*;

public class PointApp {

    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ();
        PointXYZ p2 = new PointXYZ(1, 12, 900);
        PointXYZ p3 = new PointXYZ(2, 200, 2000);

        p1.setX(3);
        p1.setY(4);
        p1.setZ(5);

        System.out.println(p1.convertToString());
        System.out.println(p2.convertToString());
        System.out.println(p3.convertToString());

        System.out.printf("Distance from XY: %.2f \n" , p1.getXZDistance());
        System.out.println("Distance from YZ: " +p1.getYZDistance());
        System.out.println("Distance from XZ: " +p1.getXZDistance());
        System.out.println("Distance from XYZ: " +p1.getXYZDistance());
    }
}
