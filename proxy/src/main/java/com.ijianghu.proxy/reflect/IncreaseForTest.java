package com.ijianghu.proxy.reflect;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kai on
 * @date 2019/4/3 22:59
 */
public class IncreaseForTest {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for(int num:arr){
            System.out.println(num);
            num =1;
        }
        System.out.println(arr[0]);

        List<String> list = new ArrayList<String>();
        list.add("xxx");
        for(String str : list){
            str = "yyy";
        }
        System.out.println(list.get(0));

    }

}
