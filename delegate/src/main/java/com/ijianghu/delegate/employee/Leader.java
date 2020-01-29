package com.ijianghu.delegate.employee;

import cn.hutool.core.collection.CollUtil;

import java.util.HashMap;

/**
 * @author kai on
 * @date 2019/3/18 10:37
 */
public class Leader {


    private HashMap<String,Object> target = new HashMap<String, Object>();

    public Leader(){
        target.put("business",new EmployeeA());
        target.put("architecture",new EmployeeB());
    }



    public void doing(String task){
        IEmployee employee = (IEmployee) target.get(task);
        if(null == employee){
            System.out.println("需要招聘相应人才");
        }else{
            employee.doing(task);
        }

    }

}
