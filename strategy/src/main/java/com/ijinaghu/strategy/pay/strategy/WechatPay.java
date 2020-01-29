package com.ijinaghu.strategy.pay.strategy;

/**
 * @author kai on
 * @date 2019/3/18 16:54
 */
public class WechatPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}
