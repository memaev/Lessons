package org.example;
import com.sun.source.tree.ClassTree;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.example.entity.*;
import org.example.repository.RegistrationUtil;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        OnResultCallback<String> callback = new OnResultCallback<String>() {
            @Override
            public void onSuccess(String data) {

            }

            @Override
            public void onFailure(String msg, String data) {

            }
        };
        getData(5, callback);
    }

    private static void getData(int a, OnResultCallback<String> callback) {
        if (a>5)
            callback.onSuccess("Succeed");
        else
            callback.onFailure("Failure", null);
    }
}