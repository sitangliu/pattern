package com.adapter.thirdLogin.service;

import com.adapter.thirdLogin.MsgResult;
import com.adapter.thirdLogin.po.Member;

/**
 * @author kai on
 * @date 2019/3/19 10:40
 */
public class SiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public MsgResult regist(String username,String password){

        return new MsgResult(200,new Member(),"注册成功");
    }

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public MsgResult login(String username,String password){

        return new MsgResult(200,new Member(),"登录成功");
    }

}
