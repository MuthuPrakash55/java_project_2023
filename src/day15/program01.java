package day15;

import java.util.ArrayList;
import java.util.Arrays;

public class program01 {

	public static void main(String[] args) {
		ArrayList<Integer> x=new ArrayList<>();
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        System.out.println(x);
        x.add(40);
        x.add(80);
        System.out.println(x);
        x.remove(4);
        System.out.println(x);
        System.out.println(x.get(3));//Get function
        System.out.println(x.size());//Size function
        Integer y[]= {40,90,99,88,33};
        x.addAll(Arrays.asList(y));//convert arrays to list & add all values of y in x 
        System.out.println(x);
        Integer z[]= {10,30,99};
        x.removeAll((Arrays.asList(z)));//convert arrays to list & remove all values of z in x
        System.out.println(x);
        System.out.println(x.contains(80));//to verify the value is in x or not
        System.out.println(x.contains(666));//to verify the value is in x or not
        Integer a[]= {20,40,90};
        System.out.println(x.containsAll(Arrays.asList(a)));//to verify all the values of a is in x or not 
	    Integer b[]= {10,20,99};
	    System.out.println(x.containsAll(Arrays.asList(b)));//to verify all the values of b is in x or not 
	    x.add(3,66);//add values in between the indexes
	    System.out.println(x);
	    x.set(3,666);//replace the values in the index
	    System.out.println(x);
	    System.out.println(x.isEmpty());
	    x.clear();
	    System.out.println(x.isEmpty());
	    System.out.println(x);
	
	
	
	
	}

}
