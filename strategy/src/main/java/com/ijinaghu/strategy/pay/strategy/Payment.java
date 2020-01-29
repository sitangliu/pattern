package com.ijinaghu.strategy.pay.strategy;

import com.ijinaghu.strategy.pay.MsgResult;

/**
 * @author kai on
 * @date 2019/3/18 15:24
 * 支付渠道
 * 定义支付规范和支付逻辑
 */
public abstract class Payment {

    //支付类型
    public abstract String getName();

    //查询余额
    protected abstract double queryBalance(String uid);

    //扣款支付
    public MsgResult pay(String uid, double amount){
        if(queryBalance(uid)<amount){
            return new MsgResult(510,queryBalance(uid),"余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额："+amount);
    }

}
