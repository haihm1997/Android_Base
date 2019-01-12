package com.example.macbookpro.tickketapp.models;

import android.databinding.BaseObservable;

public class BaseApiModel extends BaseObservable {
    private int resultCode;
    private String message;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
