package com.company.formation.fr.dessin;

public class Point2D {
    public Integer x;
    public Integer y;
    public static Integer cpt = 0;

    public static Integer getCpt() {
        return Point2D.cpt += 1;
    }

    public Point2D(){
        this.setX(0);
        this.setY(0);
        Point2D.getCpt();
    }
    public Point2D(Integer vX, Integer vY) {
        this.setX(vX);
        this.setY(vY);
        Point2D.getCpt();
    }

    public Integer getX() {
        return this.x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void displayPoint(){
        System.out.println("[".concat(x.toString()).concat((", ")).concat((y.toString())).concat(("]")));
    }

    public void translate(Integer dX, Integer dY){
        this.setX(this.x+dX);
        this.setY(this.y+dY);
    }
}
