package com.example.inheritance_mad8;

public class Square extends Shape{


    public Square(int x,int y) {
        super(x,y);
    }

    int area(){
        return getX()*getY();
    }
    int circumference(){
        return 4*getX();
    }
}
