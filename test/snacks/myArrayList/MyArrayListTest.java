package snacks.myArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void canAddToListTest(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(34);
        assertEquals(1, myArrayList.size());
    }

    @Test
    void canRemoveFromListTest(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(34);
        myArrayList.add(2);
        myArrayList.add(8);
        System.out.println(myArrayList);
        assertEquals(3, myArrayList.size());
        myArrayList.remove(0);

        System.out.println(myArrayList);

        myArrayList.add(67);
        System.out.println(myArrayList);
        assertEquals(3, myArrayList.size());
    }

}