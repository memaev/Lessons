package org.example;
import org.example.entity.*;
import org.example.repository.RegistrationUtil;

import java.util.ArrayList;
import java.util.Scanner;

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

    static void solve(String str){
        // a a b
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.gc();

        Teacher teacher = new Teacher(30, 5, "Teacher", "One");
        RegistrationUtil.register(teacher);
        System.out.println(teacher.getAge());

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Jnn");
        arr.add("pop");

        arr.remove("pop");

        String s1 = "abc";
        String s2 = "abc";
        if (s1.equals(s2)) System.out.println("==");
        else System.out.println("!=");
    }
}