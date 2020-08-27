package com.Map_Set_List;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<Integer,String> student=new HashMap<>();
        student.put(1754017,"hanzexu");
        student.put(1754018,"hanzexu1");
        student.put(1754019,"hanzexu");
        student.put(1754018,"hanzexu11");
        System.out.println(student.get(1754018));
        for (Map.Entry<Integer,String>entry:student.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        for(String s:student.values()){
            System.out.println(s);
        }
    }
}
