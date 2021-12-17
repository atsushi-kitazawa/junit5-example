package com.example.dynamic.test;

public class DynamicTestTarget {

    public static boolean isUpperCase(String input) {
        if(isNullOrEmpty(input)) {
            return false;
        }

        char[] cs = input.toCharArray();
        for(char c : cs) {
            Character cc = Character.valueOf(c);
            if(!Character.isUpperCase(cc)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLowerCase(String input) {
        if(isNullOrEmpty(input)) {
            return false;
        }
        
        char[] cs = input.toCharArray();
        for(char c : cs) {
            Character cc = Character.valueOf(c);
            if(!Character.isLowerCase(cc)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNullOrEmpty(String input) {
        if(input == null || input.isEmpty()) {
            return true;
        }
        return false;
    }
}
