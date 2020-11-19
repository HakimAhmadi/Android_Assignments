package com.example.inheritance_mad8;

public class Rectangle extends Shape{


    public Rectangle(int w, int l) {
        super(w,l);
    }

    int area(){
        return getX()*getY();
    }
    int circumference(){
        return 2*(getX()+getY());
    }

}
