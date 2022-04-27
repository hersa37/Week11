package week11.shapes3d;

import week11.shapes2d.Circle;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    public double getBaseArea(){
        return getArea();
    }

    public String toString(){
        return "Cylinder["+super.toString()+"Height: "+height+"]";
    }
}
