package com.company;

public class Main {

    public static void main(String[] args) {
        double[] array = {1.2,-2.3,3.1,-4.5,5.6,-6.4,4.8,-1.6,7.8,-7.9,8.7,-8.5,9.1,-9.4,2.3};
        double avaragenumber = 0;
        double t = 0, l = 0;
        for (double j : array){
            if (j<0){
                ++l; continue;
            }
            if (l>0 && j>0){
                ++t;
                avaragenumber += j;
            }
            System.out.println(avaragenumber/t);
        }
    }
}
