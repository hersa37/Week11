package week11.shapes3d;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, Point point, double height, String color){
        super(radius, point, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public double getArea() {
        return super.getArea()+(super.getCircumference()*height);
    }

    public String toString(){
        return "{ Height: "+height+"; "+super.toString()+"}";
    }
}
