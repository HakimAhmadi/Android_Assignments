package com.example.inheritance_mad8;

public class Circle extends Shape{
    int r;

    public Circle(int x, int y,int r) {
        super(x,y);
        this.r=r;
    }

    double area(){
        return Math.PI * Math.pow(r,2);
    }

    double circumference(){
        return 2*Math.PI *r;
    }
}
