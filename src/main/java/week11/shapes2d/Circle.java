/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package week11.shapes2d;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle {
    private double radius;
    private String color;
    
    public Circle(double radius, String color){
        this.radius=radius;
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

    @Override
    public String toString(){
        return "Circle[Radius: "+radius
                +"; Color: "+color+"]";
    }
}
