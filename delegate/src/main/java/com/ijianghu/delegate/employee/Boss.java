package com.ijianghu.delegate.employee;

/**
 * @author kai on
 * @date 2019/3/18 10:42
 */
public class Boss {

    private Leader leader;

    public void publishTask(String task,Leader leader){
        this.leader = leader;
        leader.doing(task);
    }

}
