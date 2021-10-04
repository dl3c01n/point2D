package com.company.formation.fr.dessin;

public class Point2D {
    public Integer x;
    public Integer y;

    public Point2D(Integer x, Integer y) {
        this.x = x;
        this.y = y;
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
