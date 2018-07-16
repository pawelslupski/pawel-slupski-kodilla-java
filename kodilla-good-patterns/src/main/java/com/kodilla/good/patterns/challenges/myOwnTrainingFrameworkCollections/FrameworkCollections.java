package com.kodilla.good.patterns.challenges.myOwnTrainingFrameworkCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FrameworkCollections {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.add(0, 10);

        for(int i: arrayList) {
            System.out.println(i);
        }

        int x = arrayList.get(0);
        System.out.println(x);

        arrayList.remove(1);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Pablo Picassso");
        hashMap.put(3, "Pablo Fonte");
        hashMap.put(7, "Jan Kowalski");
        hashMap.put(9, "David Kanitto");

        // System.out.println(hashMap.get(7));

        ArrayList<String> mapList = new ArrayList<String>(hashMap.values());

        Collections.shuffle(mapList);

        for(String s: mapList) {
            System.out.println(s);
        }
    }
}
