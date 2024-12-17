package com.yash.corejava.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {


        Map map= new HashMap();

        map.put(1,"Ajay");
        map.put(2,"Vijay");
        map.put(3,"Amisha");
        map.put(4,"Neeta");
     //   map.put(5,50);

         // Traditional Approach (Old Approach)
//        Set set = map.entrySet();
//        Iterator itr =set.iterator();
//        while(itr.hasNext())
//        {
//            Map.Entry e = (Map.Entry)itr.next();
//            System.out.println(e.getKey()+"-"+e.getValue());
//        }

        // Second Approach (Smart Approach)
//        for(Map.Entry m : map.entrySet())
//        {
//            System.out.println(m.getKey()+"-"+m.getValue());
//
//        }
        System.out.println("=======================================================================");

        //map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        map.entrySet().stream().forEach(System.out::println);;

        System.out.println(map.get(2));


    }
}
