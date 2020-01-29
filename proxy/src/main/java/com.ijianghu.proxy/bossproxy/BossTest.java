package com.ijianghu.proxy.bossproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author kai on
 * @date 2019/3/12 15:23
 */
public class BossTest {

    public static void main(String[] args) {

        People instance = (People)new BossCompany().getInstance(new ItWorker());
//        System.out.println(instance);
        instance.findJob();
      /*  byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{People.class});
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E://$Proxy0.class");
            fileOutputStream.write($Proxy0s);
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }*/

    }

}
