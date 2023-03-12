package com.katas;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import static com.katas.AnagramsFinder.readFileToSet;

public class Main {

    public static void main(String[] args) {

//        Set<String> contentSet = new HashSet<>();
//        contentSet = readFileToSet("resources/woerter.txt");
//        System.out.println(contentSet.stream().sorted().collect(Collectors.toList()));
          AnagramsFinder.findPermutations("CAT");

    }
}
