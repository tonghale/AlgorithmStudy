package com.dscl.labuladong;
/*使用双向hash链表实现 LRU 算法*/


import java.util.LinkedHashMap;

public class LRUCache {

    /*定义容量*/
    int size;
    /*核心数据结构*/
    LinkedHashMap<Integer,Integer> cache;

    public LRUCache(int size){
        this.size = size;
        this.cache = new LinkedHashMap<>();
    }

    /*每当访问时，更新对应缓存的优先级*/
    private void makeRecently(int key){
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key,val);
    }

    public int get(int key){
        if(cache.containsKey(key)){
            makeRecently(key);
            return cache.get(key);
        }else {
            return -1;
        }
    }

    public void put(int key, int val){
        if(cache.containsKey(key)){
            cache.put(key,val);
            makeRecently(key);
            return;
        }
        /*如果超出了size*/
        if(cache.size() >= this.size){
            /*链表头部就是最久未使用的key*/
            int oldkey = cache.keySet().iterator().next();
            cache.remove(oldkey);
        }

        cache.put(key,val);

    }



}
