package com.company.formation.fr.dessin;

public class Point3D extends Point2D {
    public Integer z;

    public Point3D() {
        setZ(0);
    }

    public Point3D(Integer z, Integer x, Integer y) {
        setZ(z);
        setX(x);
        setY(y);
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getZ() {
        return this.z;
    }

    public void displayPoint() {
        System.out.println("[".concat(getX().toString()).concat((", ")).concat((getY().toString())).concat((", ")).concat((getZ().toString())).concat(("]")));
    }

    public void translate(Integer dZ) {
        setZ(z+dZ);
    }
}
