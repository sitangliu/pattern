package com.adapter.thirdLogin2.loginAdapter;

import com.adapter.thirdLogin.MsgResult;
import com.adapter.thirdLogin2.LoginAdapter;

/**
 * @author kai on
 * @date 2019/3/19 13:34
 */
public class LoginForTelAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public MsgResult login(String id, Object adapter) {
        return null;
    }
}
