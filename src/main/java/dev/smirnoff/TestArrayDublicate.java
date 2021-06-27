package dev.smirnoff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 14.05.2021
 */
public class TestArrayDublicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dog", "cat", "mouse", "cat" , "dog", "cat" );

        System.out.println("В коллекции "+ countDublicate(list) + " дубликатов");

        System.out.println("Дубликаты " + listDublicate(list));

    }

    public static <E> int countDublicate(List<E> list){
        Set<E> set = new HashSet<>(list);
        return list.size() - set.size();
    }

    public static <E> Set<E> listDublicate(List<E> list){
        Set<E> result = new HashSet<>();
        //List<E> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            E a = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if(i==j) continue;
                if(a.equals(list.get(j))){
                    result.add(a);
                }
            }
        }
        return result;
    }
}
