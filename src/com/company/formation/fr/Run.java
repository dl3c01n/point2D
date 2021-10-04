package com.company.formation.fr;

import com.company.formation.fr.dessin.Point2D;

public class Run {
    public static void main(String[] args){
        Point2D point1 = new Point2D(4, 4);
        Point2D point2 = new Point2D(5, 5);

        point1.displayPoint();
        point1.translate(5, 5);
        point2.displayPoint();
        point2.translate(6, 6);
    }
}
