package com.ijinaghu.strategy.promotion;

import com.ijinaghu.strategy.promotion.factory.PromotionFactory;
import com.ijinaghu.strategy.promotion.impl.CouponStrategy;

import javax.swing.*;

/**
 * @author kai on
 * @date 2019/3/18 14:24
 */
public class PromotionTest {

    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new CouponStrategy());
        promotionActivity.execute();
        PromotionStrategy promotionStrategy = PromotionFactory.getPromotionStrategy("CASHBACK");
        promotionStrategy.doPromotion();
    }

}
