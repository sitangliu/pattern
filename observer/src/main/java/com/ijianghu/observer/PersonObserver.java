package com.ijianghu.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author kai on
 * @date 2019/3/24 19:40
 */
public class PersonObserver implements Observer{


    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
