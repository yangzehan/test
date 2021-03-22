package com.yangzehan.service.impl;

import com.yangzehan.dao.userdao;
import com.yangzehan.service.userservice;
import com.yangzehan.user.user;

public class userserviceimpl implements userservice {
private userdao userdao;

    public void setUserdao(com.yangzehan.dao.userdao userdao) {
        this.userdao = userdao;
    }

    @Override
    public int add(user user) {
        int num=userdao.insert(user);
        return num;
    }
}
