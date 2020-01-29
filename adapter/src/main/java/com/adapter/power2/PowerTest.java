package com.adapter.power2;


/**
 * @author kai on
 * @date 2019/3/19 10:15
 */
public class PowerTest {

    public static void main(String[] args) {
        int output = new PowerAdapter(new AC220()).outoutDC5V();
        System.out.println("得到输出电流"+output);
    }

}
