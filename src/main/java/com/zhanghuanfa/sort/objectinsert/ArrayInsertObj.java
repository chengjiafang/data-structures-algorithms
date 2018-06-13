package com.zhanghuanfa.sort.objectinsert;

/**
 * @author zhanghuanfa  2018-06-05 17:01
 */
public class ArrayInsertObj {
    private Person[] a;
    private int numOfElements;

    ArrayInsertObj(int max) {
        this.a = new Person[max];
        this.numOfElements = 0;
    }

    void insert(Person person){
        this.a[numOfElements] = person;
        this.numOfElements++;
    }

    void insertSort(){
        int in,out;
        for (out = 1; out < this.numOfElements; out++) {
            in = out;
            Person tmp = this.a[out];
            while (in > 0 && this.a[in-1].getLastName().compareTo(tmp.getLastName()) > 0){
                this.a[in] = this.a[in-1];
                in--;
            }
            this.a[in] = tmp;
        }
    }

    void display() {
        for (int i = 0; i < this.numOfElements; i++){
            System.out.println(this.a[i]);
        }
    }
}
