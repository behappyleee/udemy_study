package oop;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class TestJava {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Scanner scan = new Scanner(System.in);

        Class<?> clazz = Class.forName("");
        Object obj = clazz.getDeclaredConstructor().newInstance();



    }

}
