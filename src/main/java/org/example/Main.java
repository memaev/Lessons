package org.example;
import com.sun.source.tree.ClassTree;
import org.example.entity.*;
import org.example.repository.RegistrationUtil;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    static double return5(){
        return 5.5;
    }

    static void print(int a){
        if (a<0) return;
        System.out.println("a>=0");
    }

    static String printSmth(double num){
        if (num>=5.0) return ">5.0";
        return "<5.0";
    }

    /*
    nums: 1 2 3; size(n) = 3
    res: 1 2 3 1 2 3
     */

    //res[i] = nums[i]
    //res[i+n] = nums[i]
    static List<Integer> solve(List<Integer> list) {
        int n = list.size();
        List<Integer> res = new ArrayList<>();

        //заполняем лист дефолтными значениями
        for (int i=0; i<2*n; i++) {
            res.add(0);
        }

        //выполняем нужные действия
        for (int i=0; i<n; i++) {
            int curr = list.get(i);
            res.set(i, curr);
            res.set(i+n, curr);
        }
        return res;
    }

    static class Bmw implements Car {
        @Override
        public void toDrive() {
            System.out.println("Driving in bmw");
        }

        @Override
        public void toBreak() {
            System.out.println("Breaking the bmw");
        }
    }

    static class Lada implements Car {
        @Override
        public void toDrive() {
            System.out.println("Driving in lada");
        }

        @Override
        public void toBreak() {
            System.out.println("Breaking the lada");
        }

        public String getStr(){return "Hello";}
    }

    interface Car {
        void toDrive();
        void toBreak();
    }

    public static void doSmth(Car car){
        car.toDrive();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // API - Application Programming Interface
        List<Integer> list = new ArrayList<>();
        Car car = new Bmw();

        doSmth(new Bmw());
        doSmth(new Lada());
    }
}