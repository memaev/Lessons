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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Integer> inputList = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int buff = scan.nextInt();
            inputList.add(buff);
        }
        System.out.println(solve(inputList));
    }

    /*
    1. Считать n (done)
    2. Считать входной массив (done)
    3. Создать новый массив (done)
    4. Пройтись по входному массиву и составить результат
    5. Вернуть и вывести результат
     */
}