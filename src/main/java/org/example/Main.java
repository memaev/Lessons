package org.example;
import com.sun.source.tree.ClassTree;
import org.example.entity.*;
import org.example.repository.RegistrationUtil;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

        LinkedList<String> list = new LinkedList<>();
        list.add("Str1");
        list.add("Str2");
        list.add("Str3"); //добавление элемента в конец списка
        System.out.println(list);

        //удаление первого появления элемента в списке
        list.remove("Str3");
        System.out.println(list);

        //добавление элемента в начало списка
        list.addFirst("Str4");
        System.out.println(list);

        System.out.println("Enter line: ");
        String str = scan.nextLine(); //считываем данные от пользователя
        if (list.contains(str)){
            System.out.println("List contains input str");
        }else{
            System.out.println("List does not contain input str");
        }

        if (list.isEmpty()){
            System.out.println("List is empty");
        }else
            System.out.println("List is not empty");

        for (String string : list){
            System.out.println(string);
        }

        List<Double> arrList = new ArrayList<>();

    }
}