package com.adapter.thirdLogin2;

import com.adapter.thirdLogin.MsgResult;
import com.adapter.thirdLogin.service.SiginService;
import com.adapter.thirdLogin2.loginAdapter.LoginForQQAdapter;

/**
 * @author kai on
 * @date 2019/3/19 14:17
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    public MsgResult loginForQQ(String id) {
        MsgResult msgResult = processLogin(id, LoginForQQAdapter.class);
        loginForRegist(id,null);
        return msgResult;
    }

    public MsgResult loginForWechat(String id) {
        return null;
    }

    public MsgResult loginForSina(String id) {
        return null;
    }

    public MsgResult loginForTel(String telephone, String code) {
        return null;
    }

    public MsgResult loginForToken(String token) {
        return null;
    }

    public MsgResult loginForRegist(String username, String password) {
        super.regist(username,null);
        return super.login(username,null);
    }

    private MsgResult processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter loginAdapter = clazz.newInstance();
            if(loginAdapter.support(loginAdapter)){
                return loginAdapter.login(key,loginAdapter);
            }else{
                return null;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
