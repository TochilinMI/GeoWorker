package ru.tochilinmi.geoworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeoWorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeoWorkerApplication.class, args);
//        int[] x = new int[] {1,100,1,100,50};
//        int[] y = new int[] {1,100,100,1,150};
//
//        int planeX = 50;
//        int planeY = 120;
//
//        int poly = new Polygon(x,y,x.length).contains(new Point(planeX, planeY))?1:2;
//        System.out.println(poly);

        double[][] coord = new double[][] {
                {43.9871,56.3161},
                {43.9852,56.3164},
                {43.9849,56.3159},
                {43.9849,56.3158},
                {43.9867,56.3155},
                {43.9871,56.3161},
        };
        double[] point = new double[]{43.9860,56.3160};

//        int[][] coord = new int[][] {{1,1},{1,100},{100,100},{100,1}};
//        int[] point = new int[] {2,2};

        PointInPolygon poly = new PointInPolygon();
        System.out.println(poly.pointInPolygon(coord,point));
    }
}
