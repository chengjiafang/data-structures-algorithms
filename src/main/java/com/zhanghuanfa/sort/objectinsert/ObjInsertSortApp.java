package com.zhanghuanfa.sort.objectinsert;

/**
 * @author zhanghuanfa  2018-06-05 17:07
 */
public class ObjInsertSortApp {

    public static void main(String[] args) {
        ArrayInsertObj arrayInsertObj = new ArrayInsertObj(100);
        arrayInsertObj.insert(Person.builder().lastName("Evans").firstName("Patty").age(24).build());
        arrayInsertObj.insert(Person.builder().lastName("Smith").firstName("Doc").age(59).build());
        arrayInsertObj.insert(Person.builder().lastName("Smith").firstName("Lorraine").age(37).build());
        arrayInsertObj.insert(Person.builder().lastName("Smith").firstName("Paul").age(37).build());
        arrayInsertObj.insert(Person.builder().lastName("Yee").firstName("Tom").age(43).build());
        arrayInsertObj.insert(Person.builder().lastName("Hashimoto").firstName("Sato").age(21).build());
        arrayInsertObj.insert(Person.builder().lastName("Stimson").firstName("Henry").age(29).build());
        arrayInsertObj.insert(Person.builder().lastName("Velasquez").firstName("Jose").age(72).build());
        arrayInsertObj.insert(Person.builder().lastName("Vang").firstName("Minh").age(22).build());
        arrayInsertObj.insert(Person.builder().lastName("Creswell").firstName("Lucina").age(18).build());
        System.out.println("排序前:");
        arrayInsertObj.display();
        System.out.println("排序后");
        arrayInsertObj.insertSort();
        arrayInsertObj.display();
    }
}
