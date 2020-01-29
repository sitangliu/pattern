package com.ijinaghu.strategy.pay;

import com.ijinaghu.strategy.pay.strategy.Payment;

/**
 * @author kai on
 * @date 2019/3/18 17:30
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + "，开始扣款...");
        MsgResult pay = payment.pay(uid, amount);
        return pay;
    }
}
