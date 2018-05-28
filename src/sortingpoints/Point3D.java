/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jcourvoisier
 */
public class Point3D implements Comparable<Point3D> {
    
    private final int x;
    private final int y;
    private final int z;
    
    public Point3D(){
        this(0,0,0);
    }
    
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getZ(){
        return z;
    }
    

    public int compareTo(Point3D other){
        if(this.z != other.z){
            return this.z - other.z;
        }else if(this.x != other.x){
            return this.x - other.x;
        }else if(this.y != other.y){
            return this.y - other.y;
        }else
            return 0;
    }
    
    public String toString(){
        return "(" + x + "," + y + "," + z + ")";
    }
}
