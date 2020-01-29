package com.ijianghu.observer;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author kai on
 * @date 2019/3/24 20:32
 */
public class NewspaperOffice extends Observable{



    public String register(Observer observer){
        this.addObserver(observer);
        return "欢迎加入组织";
    }

    public void publishNewspaper(String title){
        this.setChanged();
        this.notifyObservers(title);


    }
}
