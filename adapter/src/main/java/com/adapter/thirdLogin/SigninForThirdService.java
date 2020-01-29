package com.adapter.thirdLogin;

import com.adapter.thirdLogin.service.SiginService;

/**
 * @author kai on
 * @date 2019/3/19 10:55
 */
public class SigninForThirdService extends SiginService {

    public MsgResult loginForQQ(String openId){
        //1、openId 是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）
        //4、调用原来的登录方法
        
        return loginForRegist(openId,null);
    }

    public MsgResult loginForWechat(String openId){

        return loginForRegist(openId,null);
    }
    public MsgResult loginForToken(String toekn){

        return loginForRegist(toekn,null);
    }

    public MsgResult loginForTelephone(String telephone,String code){

        return loginForRegist(telephone,code);
    }




    private MsgResult loginForRegist(String username, String password) {
        super.regist(username,null);
        return super.login(username,null);
    }

}
