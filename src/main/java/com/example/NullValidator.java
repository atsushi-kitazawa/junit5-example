package com.example;

public class NullValidator {
    
    public static void checkNull(Object object) {
        if(object == null) {
            throw new IllegalArgumentException();
        }
    }
}
