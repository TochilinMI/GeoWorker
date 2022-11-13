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
    public static Double measure(Double lat1,Double lon1,Double lat2,Double lon2){
        Double r = 6378.137; // Radius of earth in KM
        Double dLat = lat2 * Math.PI / 180 - lat1 * Math.PI / 180;
        Double dLon = lon2 * Math.PI / 180 - lon1 * Math.PI / 180;
        Double a = Math.pow(Math.sin(dLat/2),2)
                + Math.cos(lat1*Math.PI/180)
                *  Math.cos(lat2*Math.PI/180)
                * Math.pow(Math.sin(dLon/2),2);
        Double c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        Double d = r * c;
        return d * 1000;
    }
}
