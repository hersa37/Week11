/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package week11.shapes3d;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle {
    private double radius;
    private Point center;
    private String color;
    
    public Circle() {
        this(20, new Point(), "black");
    }
    
    public Circle(double radius, Point center, String color){
        this.radius=radius;
        this.center=center;
        this.color=color;
    }   
    
    public void setRadius(double radius){
        if(radius>=0){
            this.radius=radius;
        } else this.radius=0;        
    }
    
    public double getRadius(){
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    } 
    
    public void moveHorizontal(int distance){
        center.setX(center.getX()+distance);
    }
    
    public void moveVertical(int distance){
        center.setY(center.getY()+distance);
    }    
    
    @Override
    public String toString(){
        return "{Radius: "+radius
                +"; Color: "+color
                +"; Center: "+center;
    }
}
