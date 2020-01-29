package com.adapter.thirdLogin2.loginAdapter;

import com.adapter.thirdLogin.MsgResult;
import com.adapter.thirdLogin2.LoginAdapter;

/**
 * @author kai on
 * @date 2019/3/19 13:38
 */
public class LoginForWechatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    public MsgResult login(String id, Object adapter) {
        return null;
    }
}
