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
public class Point {
    private int x;
    private int y;
    
    public Point(){
        this(0, 0);
    }
    
    public Point(int x, int y){
        if(x>=0){
            this.x=x;
        } else this.x=0;
        if(y>=0){
            this.y=y;
        } else this.y=0;
    }
    
    public void setX(int x){
        if(x>=0) this.x=x;
    }
    
    public int getX(){
        return x;
    }
    
    public void setY(int y){
        if(y>=0) this.y=y;
    }
    
    public int getY(){
        return y;
    }
    @Override
    public String toString(){
        return "{"+x+","+y+"}";
    }
    
    public double distance(int x, int y){
        return Math.sqrt((Math.pow(this.x-x, 2))
            +Math.pow(this.y-y, 2));
    }
    
    public double distance(Point other){
        return Math.sqrt(Math.pow(x-other.getX(), 2)
                +Math.pow(y-other.getY(), 2));
    }
    
    public double distance(){
        return Math.sqrt((x*x)+(y*y));
    }
    
}
