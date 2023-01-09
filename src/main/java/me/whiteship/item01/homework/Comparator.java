package main.java.me.whiteship.item01.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 숫자 array를 descending으로 나열하는 클래스
 */
public class Comparator {
    
    public static void main(String[] args) {

        // List<Integer> numbArray = new ArrayList();
        Integer numbArray[] = new Integer[3];

        Scanner scannner = new Scanner(System.in);
        // numbArray.add(scannner.nextInt());
        // numbArray.add(scannner.nextInt());
        // numbArray.add(scannner.nextInt());
        numbArray[0] = scannner.nextInt();
        numbArray[1] = scannner.nextInt();
        numbArray[2] = scannner.nextInt();
        
        System.out.println("IntArray: " + numbArray);
        scannner.close();

        Arrays.sort(numbArray, Collections.reverseOrder());

        System.out.println("After sorting:: " + Arrays.toString(numbArray));
        

        // 1. Array 방식 
        // 2. Array.sort()의 인자로써의 Array
        
    }
}
