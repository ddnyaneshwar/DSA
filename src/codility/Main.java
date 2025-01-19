package codility;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int i=1041;
        System.out.println(
                Stream.of(Integer.toBinaryString(i).replaceAll("0+$","").split("1+"))
                        .filter(st -> st!=null)
                .map(String::length).max(Integer::compare).orElse(0));
    }
}
