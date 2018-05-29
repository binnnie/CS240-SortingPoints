/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Brandon Dixon, Jordan Courvoisier
 * 05/29/2018
 * Point3D.java
 *
 * An object to represent a 3D point in space.
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

    //Returns X value
    public int getX(){
        return x;
    }

    //Returns Y value
    public int getY(){
        return y;
    }

    //Returns Z value
    public int getZ(){
        return z;
    }
    
    /* Accepts another 3D point and returns negative if that point is greater, 0 if it is equal, or
     * positive if it is less.
     */
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

    //Returns a string representation of the point.
    public String toString(){
        return "[" + x + "," + y + "," + z + "]";
    }
}
