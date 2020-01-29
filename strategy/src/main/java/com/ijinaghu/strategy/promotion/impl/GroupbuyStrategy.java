package com.ijinaghu.strategy.promotion.impl;

import com.ijinaghu.strategy.promotion.PromotionStrategy;

/**
 * @author kai on
 * @date 2019/3/18 14:18
 */
public class GroupbuyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价优惠20%");
    }
}
