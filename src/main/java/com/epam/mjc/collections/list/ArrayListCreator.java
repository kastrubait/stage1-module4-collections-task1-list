package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        int sizeList = sourceList.size();
        ArrayList<String>  arrayList = new ArrayList<>();

        for (int i = 1; i <= sizeList; ++i) {
            if (i % 3 == 0) {
                String word = sourceList.get(i - 1);
                arrayList.add(word);
                arrayList.add(word);
            }
        }
        return arrayList;
    }
}
