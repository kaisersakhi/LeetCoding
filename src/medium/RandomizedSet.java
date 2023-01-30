package medium;

import java.util.*;

public class RandomizedSet {
    private final HashMap<Integer, Integer> map;
    private final int[] list;
    private int counter;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new int[200001];
        counter = -1;
    }


    public static void main(String[] args) {
        RandomizedSet instance = new RandomizedSet();

        System.out.println(instance.insert(1));
        System.out.println(instance.remove(2));
        System.out.println(instance.insert(2));
        System.out.println(instance.remove(1));
        System.out.println(instance.insert(2));
//        System.out.println(instance.remove(0));

//        System.out.println(instance.insert(3));
//        System.out.println(instance.insert(3));
//        System.out.println(instance.insert(1));
//        System.out.println(instance.remove(3));
//        System.out.println(instance.insert(0));
//        System.out.println(instance.remove(0));


    }

    boolean insert(int val) {

        if (!map.containsKey(val)) {
            map.put(val, ++counter);
            list[counter] = val;
            return true;
        }
        return false;
    }

    boolean remove(int key) {
        if (map.containsKey(key)) {
            int index = map.get(key);
            map.put(list[counter], index);
            list[index] = list[counter--];
            map.remove(key);
            return true;
        }
        return false;
    }

    public int getRandom() {
        return list[(int)(Math.random() * counter + 1)];
    }

    public void printList() {
        System.out.println(list);
    }

}
