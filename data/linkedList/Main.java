import java.util.*;

public class Main {
    public static void main(String[] args) {
       LinkedList<String> al = new LinkedList<String>();
       al.add("Ravi");
       al.add("Agostinho");
       al.add("Dos");
       al.add("Santos");

       // Adding an element at the specific position
       al.add(1, "Gaurav");
       
       // Adding second list elements to the first list
       al.addAll(al);

       // Adding an elements at the first
       al.addFirst("Lokesh");

       // Adding an element at the last position
       al.addLast("Harsh");

       // Removing specific element from arraylist
       al.remove("Santos");

       // Removing all the elements from arrayList
       //al.removeAll(al);

       Iterator<String> itr = al.iterator();
       while(itr.hasNext()) {
        System.out.println(itr.next());
       }

       // Reverse a list of elements
       System.out.println("----------------------");
       
       Iterator i = al.descendingIterator();
       while(i.hasNext()) {
           System.out.println(i.next());
       }
    }
}