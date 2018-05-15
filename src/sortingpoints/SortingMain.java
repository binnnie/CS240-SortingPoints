package sortingpoints;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

// Ryan Parsons
// May 23rd, 2017
// Version 2.0

/* 
   Simple program to display 3 dimensional point objects on a graphical interface.
   Points use the z coordinate to determine which is on top. Several differnt sorting
   algorithms are used (to be implemented by you) to sort the elements into the proper
   ordering for display.
*/

public class SortingMain {

   // Set to false if you want output that varies each time
   public static final boolean DEBUG = true;
   
   // Radius for the circles drawn
   public static final int RADIUS = 20;
   
   // Maximum z value for Point3D objects
   public static final int Z_MAX = 50;
   
   // Number of points to get displayed
   public static final int NUM_POINTS = 200;

   public static void main(String[] args) {
      // Setting up the graphics
      DrawingPanel p = new DrawingPanel(600, 600);
      p.setBackground(Color.CYAN);
      Graphics g = p.getGraphics();
      int panelWidth = p.getWidth();
      int panelHeight = p.getHeight();
      
      Random r;
      if(DEBUG) {
         // If debugging/testing uses a seed of 42 to ensure the same reasults each time
         r = new Random(42); 
      } else {
         r = new Random();
      }
      
      List<Point3D> points = makeList(r, panelWidth, panelHeight);
      
      drawPoints(points, g, r);
      
   }
   
   // Takes in a Random object and creates and returns a new list of NUM_ POINTS Point3D objects
   // with random x, y, and z coordinates
   // x and y coordinates are bounded by the current window size of the 
   // DrawingPanel, while z is bounded by a class constant
   public static List<Point3D> makeList(Random r, int panelWidth, int panelHeight) {
      List<Point3D> list = new ArrayList<Point3D>();
      for(int i = 0; i < NUM_POINTS; i++) {
         int x = r.nextInt(panelWidth - RADIUS);
         int y = r.nextInt(panelHeight - RADIUS);
         int z = r.nextInt(Z_MAX);
         list.add(new Point3D(x, y, z));
      }
      return list;
   }
   
   // Given a list of Point3D objects, a Graphics object, and a Random objects, draws the points
   // in the provided list on the DrawingPanel
   public static void drawPoints(List<Point3D> points, Graphics g, Random r) {
      // Array of colors to randomly choose a color from when drawing a point
      Color[] colors = {Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.MAGENTA,
         Color.GRAY, Color.PINK, Color.WHITE, Color.BLACK};
      
      // Array to be sorted
      Point3D[] pointArray = (Point3D[]) points.toArray(new Point3D[0]);
      
      // Used as default, you should be using your sorting algorithms instead
      // Arrays.sort(pointArray);
      
      /*
      
         call various sort methods here
         all sort methods should result in the same output
         
         insertionSort
         selectionSort
         heapSort (in-place)
         mergeSort
      
      */
      
      
      
      // insertionSort(pointArray);
       selectionSort(pointArray);
      // heapSort(pointArray);
      // mergeSort(pointArray);
      
      for(int i = pointArray.length - 1; i >= 0; i--) {
         g.setColor(colors[r.nextInt(colors.length)]);
         g.fillOval(pointArray[i].getX(), pointArray[i].getY(), RADIUS, RADIUS);
      }
   }
   
   public static void insertionSort(Point3D[] points) {
       System.out.println(Arrays.toString(points));
       for(int i = 1; i < points.length; i++){
           int index = linearSearch(points, points[i], i - 1);
           Point3D hold = points[i];
           for(int n = i; n > index; n--){ 
               points[n] = points[n - 1];
           }
           points[index] = hold;
       }
       System.out.println(Arrays.toString(points));
   }
   
   public static void selectionSort(Point3D[] points) {
       for(int i = 0; i < points.length; i++){
           int least = points.length - 1;
           for(int n = points.length - 1; n > i; n--){
               if (points[n].compareTo(points[least]) < 0) {
                   least = n;
               }
           }
           Point3D hold = points[least];
           points[least] = points[i];
           points[i] = hold;
       }
       System.out.println(Arrays.toString(points));
   }
   
   public static void heapSort(Point3D[] points) {
      /*
         Your code here
      */
   }
   
   public static void mergeSort(Point3D[] points) {
      /*
         Your code here
      */
   }   

   private static int linearSearch(Point3D[] array, Point3D point, int sorted){
       boolean found = false;
       int index = 0;
       while(!found && index <= sorted){
            if(point.compareTo(array[index]) <= 0){
                found = true;
            } else {
                index++;
            }
       }
      
       return index;
   }
   
}