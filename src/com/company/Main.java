package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("Xachik");
        customLinkedList.add("Vachik");
        customLinkedList.add("Hrachik");
        customLinkedList.add("Qajik");
        System.out.println(customLinkedList + "" + customLinkedList.size());
        customLinkedList.addByIndex(2, "Tajik");
        System.out.println(customLinkedList + "" + customLinkedList.size());
        customLinkedList.remove(2);
        System.out.println(customLinkedList + "" + customLinkedList.size());
        System.out.println(customLinkedList.getFirst());
        System.out.println(customLinkedList.getLast());

        LinkedList<Integer> linkedList = new LinkedList<>();
        CustomLinkedList<Integer> integerCustomLinkedList = new CustomLinkedList<>();

        long l = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        long l1 = System.currentTimeMillis();

        System.out.println(l1 - l);

        long l2 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            integerCustomLinkedList.add(i);
        }
        long l3 = System.currentTimeMillis();
        System.out.println(l3 - l2);

    }

}
