package com.adapter.power;

/**
 * @author kai on
 * @date 2019/3/19 10:15
 */
public class PowerTest {

    public static void main(String[] args) {
        int output = new AC110(new AC220()).output();
        System.out.println("得到输出电流"+output);
    }

}
