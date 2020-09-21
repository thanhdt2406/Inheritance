package com.codegym;

public class Point3D extends Point2D{
    private float z;

    public Point3D(){
        super();
        this.z=0f;
    }

    public Point3D(float x, float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {this.getX(),this.getY(),this.z};
        return arr;
    }

    @Override
    public String toString(){
        return "A point 3D with (x,y,z) = ("+this.getX()+","+this.getY()+","+this.z+")";
    }
}
