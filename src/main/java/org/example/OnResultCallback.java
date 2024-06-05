package org.example;

public interface OnResultCallback<T> {
    void onSuccess(T data);
    void onFailure(String msg, T data);
}
