package headfirst.designpatterns.templatemethod;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 2);
        map.put(10000, 9890);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public int dfsjl() {
//        int[] ints = new int[Integer.MAX_VALUE];
//        ints[0] = 2;
//        ints[10000] = 9890;
        return 0;
    }


    public static void main(String[] args) {
        int keyLimit = 1 << 20;
        int size = 100000;
        Random random = new Random();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new MyHashMap();

        map2.put(1, 39);
        map2.put(2, 39);
        map2.put(3, 39);
        map2.put(4, 39);
        map2.put(5, 39);
        System.out.println(map2.containsKey(1));
        System.out.println(map2.containsKey(2));
        System.out.println(map2.containsKey(3));
        System.out.println(map2.containsKey(4));
        System.out.println(map2.containsKey(5));
        System.out.println(map2.containsKey(6));
        System.out.println(map2.containsKey(7));
        System.out.println(map2.containsKey(8));


        for (int i = 0; i < size; i++) {
            int key = random.nextInt(keyLimit);
            int val = random.nextInt(keyLimit) + 1;
            map1.put(key, val);
            map2.put(key, val);
        }
        for (int i = 0; i < 100; i++) {
            int key = random.nextInt(keyLimit);
            boolean v1, v2;
//            if (map1.containsKey(key)) {
//            }
            v1 = map1.containsKey(key);
            v2 = map2.containsKey(key);
            assert Objects.equals(v1, v2);


        }

        long t1, t2;


        t1 = System.nanoTime();
        for (int i = 0; i < keyLimit; i++) {
            map2.get(i);
        }
        t2 = System.nanoTime();
        System.out.println(t2 - t1);


        t1 = System.nanoTime();
        for (int i = 0; i < keyLimit; i++) {
            map1.get(i);
        }
        t2 = System.nanoTime();
        System.out.println(t2 - t1);
    }

}

//
//key < 1<<20
//
//map.size() = 1,000,000;


class MyHashMap implements Map<Integer, Integer> {
    int[] ints = new int[1 << 30];

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return ints[(Integer) key] != 0;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Integer get(Object key) {
        return ints[(Integer) key];
    }

    @Override
    public Integer put(Integer key, Integer value) {
        ints[key] = value;
        return null;
    }

    @Override
    public Integer remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Integer> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Integer> keySet() {
        return null;
    }

    @Override
    public Collection<Integer> values() {
        return null;
    }

    @Override
    public Set<Entry<Integer, Integer>> entrySet() {
        return null;
    }
//
//    @Override
//    public Set<Entry<Integer, Integer>> entrySet() {
//        return null;
//    }
//
//    @Override

}