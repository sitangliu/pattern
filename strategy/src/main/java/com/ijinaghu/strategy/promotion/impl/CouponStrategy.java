package com.ijinaghu.strategy.promotion.impl;

import com.ijinaghu.strategy.promotion.PromotionStrategy;

/**
 * @author kai on
 * @date 2019/3/18 14:14
 */
public class CouponStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("领取优惠券,现金直减优惠券面额");
    }
}
