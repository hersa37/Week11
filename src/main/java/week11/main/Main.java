package week11.main;

import week11.shapes3d.Cylinder;

public class Main {

    public static void main(String[] args){
        Cylinder c1=new Cylinder(15, 10, "blue");
        cetakData(c1);

        System.out.println();

        Cylinder c2=new Cylinder(10, 20,"red" );
        cetakData(c2);
    }

    public static void cetakData(Cylinder c){
        System.out.println(c);
        System.out.println("Radius silinder: "+c.getRadius());
        System.out.println("Tinggi silinder: "+c.getHeight());
        System.out.println("Luas dasar silinder: "+c.getBaseArea());
        System.out.println("Volume: "+c.getVolume());
    }

    //TODO Laporan
}
