/*
Author: Jan McNulty
Date: 09/22/22

Description: (Distinct elements in ArrayList) Write the following method that returns a new ArrayList. The new list contains the non-duplicate elements from the original list. Use Exercise19_03.java  Download Exercise19_03.javaas the test class. 
 */
import java.util.ArrayList;

public class Exercise19_03 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(14);
    list.add(42);
    list.add(25);
    
    ArrayList<Integer> newList = removeDuplicates(list);
    
    System.out.print(newList);
  }
  
  public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
	  ArrayList<E> newList = new ArrayList<>(list.size());
	  for( E aList : list) {
		  if (!newList.contains(aList)) {
			  newList.add(aList);		  }
	  }
	  return newList;
  }
}
