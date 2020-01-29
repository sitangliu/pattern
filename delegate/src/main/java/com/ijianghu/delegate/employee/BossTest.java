package com.ijianghu.delegate.employee;

/**
 * @author kai on
 * @date 2019/3/18 10:44
 */
public class BossTest {

    public static void main(String[] args) {
        new Boss().publishTask("architecture",new Leader());
    }

}
