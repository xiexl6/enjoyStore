package com.enjoy.service.impl;

import com.enjoy.service.VipUserService;
import org.springframework.stereotype.Service;

@Service("vipUserService")
public class VipUserServiceImpl implements VipUserService {

    public String getVipDetail(String id) {
        System.out.println(super.getClass().getName()+"被调用一次："+System.currentTimeMillis());
        return "13221";
    }
}
