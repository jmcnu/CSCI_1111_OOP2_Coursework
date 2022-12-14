/*
Author: Jan McNulty
Date: 09/22/22

Description: 
*/
import java.util.ArrayList;

public class Exercise19_09 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(4);
    list.add(42);
    list.add(5);
    Exercise19_09.<Integer>sort(list);
    
    System.out.print(list);
  }
  public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
      for (int i = 0; i < list.size() - 1; i++) {
          E currentMin = list.get(i);
          int min = i;
          for (int j = i + 1; j < list.size(); j++) {

              if (list.get(j).compareTo(currentMin) < 0) {
                  currentMin = list.get(j);
                  min = j;
              }
          }

          if (min != i) {
              list.set(min, list.get(i));
              list.set(i, currentMin);
          }
      }
}

}