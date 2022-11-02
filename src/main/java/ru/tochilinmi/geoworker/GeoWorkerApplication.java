package ru.tochilinmi.geoworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class GeoWorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeoWorkerApplication.class, args);
        int[] x = new int[] {1,100,1,100,50};
        int[] y = new int[] {1,100,100,1,150};

        int planeX = 50;
        int planeY = 120;

        int poly = new Polygon(x,y,x.length).contains(new Point(planeX, planeY))?1:2;
        System.out.println(poly);
    }
}
