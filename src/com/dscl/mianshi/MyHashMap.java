package com.dscl.mianshi;

public class MyHashMap {

    //定义默认大小
    final private int DefaultSize = 4;

    // hashMap中元素多少
    private int count;

    // 定义负载因子
    private float loadFactor = 0.75f;

    //定义hashMap的主体，作为一个数组;
    private Entity[] table;

    /*不带size参数，则给与默认空间*/
    public MyHashMap(){
        table = new Entity[DefaultSize];
    }

    /*带size参数进行初始化*/
    public MyHashMap(int size){
        if(size<DefaultSize){
            table = new Entity[DefaultSize];
        }else {
            table = new Entity[size];
        }
    }

    public void put(Object k,Object v){
        Entity newNode = new Entity(k,v);
        int index = k.hashCode()%table.length;
        if(table[index] == null){
            table[index] = newNode;
            count++;
        }else if(table[index] != null) {
            Entity cur = table[index];
            while (cur !=null){
                // 即当前添加的k 已经存在,则覆盖value,不添加新的节点
                if(cur.key == k ){
                    cur.value = v;
                    break;
                }
                cur = cur.next;
            }
            // 即遍历完链表 没有发现有相同的key,则认为hash冲突，把新添节点串联到链表上。
            if(cur == null){
                newNode.next = table[index];
                table[index] = newNode;
                count++;
            }
        }
        if(count > table.length*loadFactor){
            //扩容至当前容量的两倍
            resize(this.table.length * 2);
        }
    }

    public void resize(int newlength){
        Entity[] newTable = new Entity[newlength];
        for(int i=0;i<this.table.length;i++){
            if(table[i] != null){
                Entity cur = table[i];
                while (cur!=null){
                    // 将原table中元素放入新table中
                    int index = cur.key.hashCode()%newlength;
                    if(newTable[index] == null){
                        newTable[index] = cur;
                    }else if(newTable[index] != null){
                        cur.next=newTable[index];
                        newTable[index] = cur;
                    }
                    cur = cur.next;
                }
            }
        }
        table = newTable;
    }

    public Object get(Object k){
        int index = k.hashCode()%this.table.length;
        if (table[index] == null){return null;}
        else {
            Entity cur = table[index];
            while (cur!=null){
                if(cur.key == k || cur.key.equals(k)){
                    return cur.value;
                }
                cur = cur.next;
            }
            return null;
        }
    }

    public int getSize(){
        return this.table.length;
    }

    /*定义一个类似于node的节点*/
    class Entity{
        Object key;
        Object value;
        Entity next;
        public Entity(Object k,Object v){
            this.key = k;
            this.value = v;
        }
    }
}
