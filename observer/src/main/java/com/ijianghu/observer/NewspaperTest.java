package com.ijianghu.observer;

/**
 * @author kai on
 * @date 2019/3/24 23:42
 */
public class NewspaperTest {

    public static void main(String[] args) {
        NewspaperOffice newspaperOffice = new NewspaperOffice();
        PersonObserver personObserver = new PersonObserver();
        String register = newspaperOffice.register(personObserver);
        System.out.println(register);
        newspaperOffice.publishNewspaper("测试");
    }

}
