package org.example;

public class ResultCallback implements OnResultCallback<String> {
    @Override
    public void onSuccess(String data) {
        System.out.println("Success: " + data);
    }

    @Override
    public void onFailure(String msg, String data) {
        System.out.println("Failure: " + msg);
    }
}
