package com.core.java;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Extrnalization implements Externalizable{
	    static int age;
	    String name;
	    int year;
	 
	    public Extrnalization()
	    {
	        System.out.println("Default Constructor called");
	    }
	 
	    Extrnalization(String n, int y,int age)
	    {
	        name = n;
	        year = y;
	        this.age = age;
	    }
	    public void writeExternal(ObjectOutput out) 
	                              throws IOException
	    {
	        out.writeObject(name);
	        out.writeInt(0);
	        out.writeInt(year);
	    }
	    public void readExternal(ObjectInput in) 
	       throws IOException, ClassNotFoundException
	    {
	        name = (String)in.readObject();
	        age = in.readInt();
	        year = in.readInt();
	    }
	    public String toString()
	    {
	        return ("Name: " + name + "\n" + 
	               "Year: " + year + "\n" + 
	               "Age: " + age);
	    }
	}
