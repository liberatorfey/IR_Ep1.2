import java.util.*;

public class test {
	
	public static void main(String args[]) {
	      // create arraylist       
	      ArrayList<String>  arlst=new ArrayList<String> ();
	      ArrayList<Doc> arlst2 = new ArrayList<Doc>();


	      arlst2.add(new Doc("a","1"));
	      arlst2.add(new Doc("b","1"));
	      arlst2.add(new Doc("c","1"));
	      
	     
	      
	      arlst.add("A");
	      arlst.add("B");
	      arlst.add("C");

	      int index=Collections.binarySearch(arlst, "A");     
	      System.out.println(index);
	      
	      int index2=Collections.binarySearch(arlst2,new Doc("a",null),Comparator.comparing(Doc :: getDoc));
	      System.out.println(index2);


	   }    

}
