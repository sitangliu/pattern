package com.adapter.thirdLogin;

/**
 * @author kai on
 * @date 2019/3/18 16:24
 */
public class MsgResult {

    private int code;
    private Object data;
    private String msg;

    public MsgResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "支付状态：["+code+"],"+msg+",交易详情："+data;
    }
}
