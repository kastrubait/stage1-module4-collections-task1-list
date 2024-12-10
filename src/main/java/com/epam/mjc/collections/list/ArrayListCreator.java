package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        int sizeList = sourceList.size();

        ArrayList<String>  arrayList = new ArrayList<>();

        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < sizeList; ++i) {

            String word = sourceList.get(i + 1);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

            if ((i + 1) % 3 == 0) {
                if (wordCount.get(word) > 1) {
                    arrayList.add(word);
                }
            }
        }
        return arrayList;
    }
}
