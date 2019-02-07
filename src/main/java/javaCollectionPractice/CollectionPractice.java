package javaCollectionPractice;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPractice {

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();

        values.add(2);
        values.add(3);
        values.add(4);
        values.add(9);
        values.remove(0);
        

//        Iterator i = values.iterator();
//        while (i.hasNext()){
//        System.out.println(i.next());
//        }

        for(Integer i:values )
            System.out.println(i);

    }
}
