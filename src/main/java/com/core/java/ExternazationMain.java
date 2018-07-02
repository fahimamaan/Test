package com.core.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternazationMain {
	
	public static void main(String[] args) {
		
	Extrnalization car = new Extrnalization("Shubham", 1995,10);
	Extrnalization newcar = null;
 
        // Serialize the car
        try {
            FileOutputStream fo = new FileOutputStream("gfg1.txt");
            ObjectOutputStream so = new ObjectOutputStream(fo);
            car.year=1000;
            so.writeObject(car);
            so.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }
 
        // Deserializa the car
        try {
            FileInputStream fi = new FileInputStream("gfg1.txt");
            ObjectInputStream si = new ObjectInputStream(fi);
            newcar = (Extrnalization)si.readObject();
        }
        catch (Exception e) {
            System.out.println(e);
        }
 
        System.out.println("The original car is:\n" + car);
        System.out.println("The new car is:\n" + newcar);
    }
}
