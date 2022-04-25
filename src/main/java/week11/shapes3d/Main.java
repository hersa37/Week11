package week11.shapes3d;

public class Main {

    public static void main(String[] args){
        Cylinder cylinder=new Cylinder(15, new Point(), 10, "blue");
        System.out.println(cylinder);
        System.out.println("Volume: "+String.format("%.05f",cylinder.getVolume()));

    }
}
