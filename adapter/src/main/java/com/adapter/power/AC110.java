package com.adapter.power;

/**
 * @author kai on
 * @date 2019/3/19 10:13
 */
public class AC110 {

    public AC220 ac220;

    public AC110(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int output(){
        int output = this.ac220.outputAC220V();
        output*=0.5;
        System.out.println("输出电流"+output+"V");
        return output;
    }

}
