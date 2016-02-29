/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg3.check.pkgif.lines.intersect;

/**
 * Given two lines on a Cartesian plane, determine whether the two lines would
 * intersect. Two same lines are considered to be intersected.
 */
public class CheckIfLinesIntersect {

    public static class Line {

        static final double EPSILON = 0.000001;
        double slope;
        double yintercept;

        public Line(double slope, double yintercept) {
            this.slope = slope;
            this.yintercept = yintercept;
        }
    }

    public static boolean intersect(Line l1, Line l2) {
        return Math.abs(l1.slope - l2.slope) > Line.EPSILON || Math.abs(l1.yintercept - l2.yintercept) < Line.EPSILON;
    }

    //TEST----------------------------------
    public static void main(String[] args) {
        Line l1 = new Line(0.4, 0.79), l2 = new Line(0.5, 0.9), l3 = new Line(0.4, 1.3);
        System.out.println(intersect(l1, l2));
        System.out.println(intersect(l3, l1));
        System.out.println(intersect(l3, l3));
    }
}
