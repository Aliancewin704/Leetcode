package org.example.Fundamental.MostCommonWord;

public class Main {
    public static void main(String[] args) {
        String[] banned = new String[]{"bob", "hit"};
        System.out.println(MostCommonWord.mostCommonWord("Bob. hIt, baLl",banned));
    }
}
