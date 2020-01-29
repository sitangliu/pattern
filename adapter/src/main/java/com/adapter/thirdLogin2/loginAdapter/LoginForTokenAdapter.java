package com.adapter.thirdLogin2.loginAdapter;

import com.adapter.thirdLogin.MsgResult;
import com.adapter.thirdLogin2.LoginAdapter;

/**
 * @author kai on
 * @date 2019/3/19 13:37
 */
public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public MsgResult login(String id, Object adapter) {
        return null;
    }
}
