package com.st.set;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<Integer>();
        Random rd = new Random();
        while (st.size() < 10){
            st.add(rd.nextInt(100) + 1);
        }

        Iterator<Integer> it = st.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
