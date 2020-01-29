package com.ijianghu.proxy.reflect;

/**
 * @author kai on
 * @date 2019/4/3 22:39
 */
public class WrapperTest {

    public static void main(String[] args) {

        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println("b1==b2"+(b1 == b2));
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println("i1==i2"+(i1 == i2));
        Integer i3 = 129;
        Integer i4 = 129;
        System.out.println("i3==i4"+(i3 == i4));
        Float f1 = 0.1f;
        Float f2 = 0.1f;
        System.out.println("f1==f2"+(f1 == f2));
        Character c1 = 127;
        Character c2 = 127;
        System.out.println("c1==c2"+(c1 == c2));

    }
}
