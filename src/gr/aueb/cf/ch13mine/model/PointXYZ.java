package gr.aueb.cf.ch13mine.model;

import static java.lang.Math.abs;
/**
 * THe Point class represents points in a three-dimensional
 * space , where x, y ,z coordinates are integers , all points
 * could be implemented as instances of this class.
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    public PointXYZ() {
    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String convertToString() {
          return "(" + x + "," + y + "," + z + ")";
    }

//     Gets x - coordinate
//     @param x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getXYDistance() {
        return Math.sqrt(x * x + y * y);
    }

    public double getYZDistance() {
        return Math.sqrt(y * y + z * z);
    }

    public double getXZDistance() {
        return Math.sqrt(x * x + z * z);
    }
    public double getXYZDistance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

}
