package com.ijinaghu.strategy.promotion.impl;

import com.ijinaghu.strategy.promotion.PromotionStrategy;

/**
 * @author kai on
 * @date 2019/3/18 14:16
 */
public class CashbackPromotion implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("返现促销，每推荐一人，返现到支付宝50元");
    }
}
