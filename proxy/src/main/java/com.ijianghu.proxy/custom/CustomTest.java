package com.ijianghu.proxy.custom;

import com.ijianghu.proxy.bossproxy.ItWorker;
import com.ijianghu.proxy.bossproxy.People;

/**
 * @author kai on
 * @date 2019/3/17 17:06
 */
public class CustomTest {

    public static void main(String[] args) {
        People instance = (People)new StBossCompany().getInstance(new ItWorker());
        instance.findJob();
    }

}
