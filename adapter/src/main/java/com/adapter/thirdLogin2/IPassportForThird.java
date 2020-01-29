package com.adapter.thirdLogin2;

import com.adapter.thirdLogin.MsgResult;

/**
 * @author kai on
 * @date 2019/3/19 13:40
 */
public interface IPassportForThird {

    /**
     * QQ登录
     * @param id
     * @return
     */
    MsgResult loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    MsgResult loginForWechat(String id);

    /**
     * 微博登录
     * @param id
     * @return
     */
    MsgResult loginForSina(String id);

    /**
     * 手机短信登录
     * @param telephone
     * @param code
     * @return
     */
    MsgResult loginForTel(String telephone,String code);

    /**
     * token登录
     * @param token
     * @return
     */
    MsgResult loginForToken(String token);

    /**
     * 注册后自动登录
     * @param username
     * @param password
     * @return
     */
    MsgResult loginForRegist(String username,String password);

}
