package com.adapter.thirdLogin2;

import com.adapter.thirdLogin.MsgResult;

/**
 * @author kai on
 * @date 2019/3/19 13:21
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    MsgResult login(String id,Object adapter);

}
