package com.ijinaghu.strategy.promotion.factory;

import com.ijinaghu.strategy.promotion.PromotionStrategy;
import com.ijinaghu.strategy.promotion.impl.CashbackPromotion;
import com.ijinaghu.strategy.promotion.impl.CouponStrategy;
import com.ijinaghu.strategy.promotion.impl.EmptyPromotion;
import com.ijinaghu.strategy.promotion.impl.GroupbuyStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kai on
 * @date 2019/3/18 14:55
 * 优惠策略工厂
 */
public class PromotionFactory {

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CashbackPromotion());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBY,new GroupbuyStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotion();

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null?NON_PROMOTION:promotionStrategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBY = "GROUPBY";
    }
}
