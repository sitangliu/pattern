package com.adapter.thirdLogin2.loginAdapter;

import com.adapter.thirdLogin.MsgResult;
import com.adapter.thirdLogin2.LoginAdapter;

/**
 * @author kai on
 * @date 2019/3/19 13:28
 */
public class LoginForQQAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public MsgResult login(String id, Object adapter) {
        System.out.println(id);
        return null;
    }
}
