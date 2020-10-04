import design1.PointCP;
import design5.PointCP3;
import design5.PointCP2;
import design5.PointCP5;

import java.util.Random;

public class test {
    static int length = 5000;

    public static void main(String[] args) {
        Random random = new Random();
        int type;
        double xOrRho;
        double yOrTheta;
        PointCP[] point1 = new PointCP[length];
        PointCP5[] point5 = new PointCP5[length];

        for (int i = 0; i < length; i++) {
            xOrRho = 5 * random.nextDouble();
            yOrTheta = 5 * random.nextDouble();
            if (random.nextInt(2) == 0) {
                point1[i] = new PointCP('C', xOrRho, yOrTheta);
                point5[i] = new PointCP3(xOrRho, yOrTheta);
            } else {
                point1[i] = new PointCP('P', xOrRho, yOrTheta);
                point5[i] = new PointCP2(xOrRho, yOrTheta);
            }
        }
        System.out.println("Average time for getting X from "+length+" PointCP1 is: "+(getX1(point1)/1000000.0)+" milliseconds");
        System.out.println("Average time for getting Y from "+length+" PointCP1 is: "+getY1(point1)/1000000.0+" milliseconds");
        System.out.println("Average time for getting Rho from "+length+" PointCP1 is: "+getRho1(point1)/1000000.0+" milliseconds");
        System.out.println("Average time for getting Theta from "+length+" PointCP1 is: "+getTheta1(point1)/1000000.0+" milliseconds");
        System.out.println("Average time for getting Distance from "+length+" PointCP1 is: "+getDistance1(point1)/1000000.0+" milliseconds");
        System.out.println("Average time for getting Rotate from "+length+" PointCP1 is: "+getRotate1(point1)/1000000.0+" milliseconds");

        System.out.println();
        System.out.println("Average time for getting X from "+length+" PointCP5 is: "+(getX5(point5)/1000000.0)+" milliseconds");
        System.out.println("Average time for getting Y from "+length+" PointCP5 is: "+getY5(point5)/1000000.0+" milliseconds");
        System.out.println("Average time for getting Rho from "+length+" PointCP5 is: "+getRho5(point5)/1000000.0+" milliseconds");
        System.out.println("Average time for getting Theta from "+length+" PointCP5 is: "+getTheta5(point5)/1000000.0+" milliseconds");
        System.out.println("Average time for getting Distance from "+length+" PointCP5 is: "+getDistance5(point5)/1000000.0+" milliseconds");
        System.out.println("Average time for getting Rotate from "+length+" PointCP5 is: "+getRotate5(point5)/1000000.0+" milliseconds");
    }

    public static long getX1(PointCP[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getX();
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getY1(PointCP[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getY();
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getRho1(PointCP[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getRho();
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getTheta1(PointCP[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getTheta();
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getDistance1(PointCP[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getDistance(p[i]);
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getRotate1(PointCP[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].rotatePoint(1);
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }

    ////////
    public static long getX5(PointCP5[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getX();
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getY5(PointCP5[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getY();
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getRho5(PointCP5[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getRho();
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getTheta5(PointCP5[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getTheta();
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getDistance5(PointCP5[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].getDistance(p[i]);
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }public static long getRotate5(PointCP5[] p){
        long start = System.nanoTime();
        for(int i =0;i<length;i++){
            p[i].rotatePoint(1);
        }
        long end = System.nanoTime();
        return (end-start)/length;
    }

}
