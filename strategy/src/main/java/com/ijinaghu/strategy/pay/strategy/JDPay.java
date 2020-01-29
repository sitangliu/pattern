package com.ijinaghu.strategy.pay.strategy;

/**
 * @author kai on
 * @date 2019/3/18 17:02
 */
public class JDPay extends Payment {
    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}
