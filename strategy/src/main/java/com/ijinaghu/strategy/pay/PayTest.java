package com.ijinaghu.strategy.pay;

/**
 * @author kai on
 * @date 2019/3/18 17:35
 */
public class PayTest {

    public static void main(String[] args) {
        Order order = new Order("1213123112313131", "sdfsadfsdfasdf", 260);
        MsgResult pay = order.pay();
        System.out.println(pay.toString());
    }

}
