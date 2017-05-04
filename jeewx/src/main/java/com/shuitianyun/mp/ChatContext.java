package com.shuitianyun.mp;

import java.util.ArrayList;
import java.util.List;

/**
 * 一次会话的上下文，包括状态处理等。
 * Created by wangchao on 2017/5/4.
 */
public class ChatContext {
    //访问者的id
    private String visitorId;
    //接待者
    //状态模式
    private String hostAgent;

    /**
     * 问答
     * @param s 关键字
     * @return 回复消息
     */
    public List<String> ask(String s){
        List<String> result = new ArrayList<String>();
        return result;
    }

}
