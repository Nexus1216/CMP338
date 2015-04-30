

import java.util.Vector;


public class Sort {
	
	
	private static Vector<Person> people;
	private static Vector<Person> tmp;

	private static int n;

	public static void merge(Vector<Person> people) {
		Sort.people = people;
	    n = people.size();
	    Sort.tmp = new Vector<Person>(n);
	    separate(0, n - 1);
	}
	
	
	private static void separate(int low, int high) {
	    if (low < high) {
	      int middle = low + (high - low) / 2;
	      separate(low, middle);
	      separate(middle + 1, high);
	      combine(low, middle, high);
	    }
	  }

	  private static void combine(int low, int middle, int high) {

	    for (int i = low; i <= high; i++) {
	      tmp.add(i, people.get(i)); 
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    while (i <= middle && j <= high) {
	      if (tmp.get(i).getName().compareTo(tmp.get(j).getName()) <= 0) {
	        people.add(k, tmp.get(i)); 
	        i++;
	      } else {
	        people.add(k, tmp.get(j)); 
	        j++;
	      }
	      k++;
	    }
	    while (i <= middle) {
	      people.add(k, tmp.get(i)); 
	      k++;
	      i++;
	    }

	  }

	
	 public static void quickMid(Vector<Person> people, int low, int high){
		    int lo = low;
		    int hi = high;
		    Person mid;

		    if (high > low) { 
		      mid = (Person) people.elementAt((low + high) / 2);

		      while (lo <= hi) {
		        while ((lo < high)&& (0 > ((Person) people.elementAt(lo)).compareTo(mid))){
		          ++lo;
		        }

		        while ((hi > low) && (0 < ((Person) people.elementAt(hi)).compareTo(mid))){
		          --hi;
		        }

		        if (lo <= hi){
		          swap(people, lo++, hi--);
		        }
		      }

		      if (low < hi){
		        quickMid(people, low, hi);
		      }

		      if (lo < high){
		    	  quickMid(people, lo, high);
		      }
		    }
	}
	 
	 public static void quickFirst(Vector<Person> people, int low, int high){
		    int lo = low;
		    int hi = high;
		    Person mid;

		    if (high > low) { 
		      mid = (Person) people.elementAt(0);

		      while (lo <= hi) {
		        while ((lo < high) && (0 > ((Person) people.elementAt(lo)).compareTo(mid))){
		          ++lo;
		        }

		        while ((hi > low) && (0 < ((Person) people.elementAt(hi)).compareTo(mid))){
		          --hi;
		        }
 
		        if (lo <= hi){
		          swap(people, lo++, hi--);
		        }
		      }

		      if (low < hi){
		    	  quickFirst(people, low, hi);
		      }

		      if (lo < high){
		    	  quickFirst(people, lo, high);
		      }
		    }
	}

		  private static void swap(Vector<Person> people, int a, int b) {
		    Person p;

		    p = people.elementAt(a);
		    people.setElementAt(people.elementAt(b), a);
		    people.setElementAt(p, b);
		  }

}
