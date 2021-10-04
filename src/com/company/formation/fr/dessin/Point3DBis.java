package com.company.formation.fr.dessin;

public class Point3DBis {
    private Point2D point2d;
    private Integer z;

    public Point3DBis() {
        this.point2d = new Point2D();
    }

    public Point3DBis(Integer x, Integer y, Integer z){
        this.point2d.setX(x);
        this.point2d.setY(y);
        this.setZ(z);
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getZ() {
        return this.z;
    }
    public void displayPoint() {
        System.out.println("[".concat(point2d.getX().toString()).concat((", ")).concat((point2d.getY().toString())).concat((", ")).concat((this.getZ().toString())).concat(("]")));
    }
    public void translate(Integer dX, Integer dY, Integer dZ) {
        this.setZ(this.getZ()+dZ);
        point2d.setX(point2d.getX()+dX);
        point2d.setY(point2d.getY()+dZ);
    }
}
