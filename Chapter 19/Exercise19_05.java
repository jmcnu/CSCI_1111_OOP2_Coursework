/*
Author: Jan McNulty
Date: 09/22/22

Description: (Maximum element in an array) Implement the following method that returns the maximum element in an array. Use Exercise19_05.java  Download Exercise19_05.javaas the test class.
 */
public class Exercise19_05 {
  public static void main(String[] args) {
    Integer[] numbers = {1, 2, 3};
    System.out.println(max(numbers));
    
    String[] words = {"red", "green", "blue"};
    System.out.println(max(words));
    
    Circle[] circles = {new Circle(3), new Circle(2.9), new Circle(5.9)};
    System.out.println(max(circles));
  }
  
  public static <E extends Comparable<E>> E max(E[] list) {
	  E max = list[0];
	  for( int i = 1; i <list.length; i++) {
		  E element = list[i];
		  if (element.compareTo(max) > 0) {
			  max = element;
		  }
		  
	  }
	  return max;
  }
 
  static class Circle implements Comparable<Circle> {
	    double radius;
	    
	    public Circle(double radius) {
	      this.radius = radius;
	    }
	    
	    @Override
	    public int compareTo(Circle c) {
	      if (radius < c.radius) 
	        return -1;
	      else if (radius == c.radius)
	        return 0;
	      else
	        return 1;
	    }
	    
	    @Override
	    public String toString() {
	      return "Circle radius: " + radius;
	    }
	  }
} 

