package com.ijinaghu.strategy.promotion.impl;

import com.ijinaghu.strategy.promotion.PromotionStrategy;

/**
 * @author kai on
 * @date 2019/3/18 14:20
 */
public class EmptyPromotion implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
