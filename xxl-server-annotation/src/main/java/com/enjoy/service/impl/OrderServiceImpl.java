package com.enjoy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.enjoy.dao.OrderDao;
import com.enjoy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

@Service()  //注意这个service注解时dubbo包里的，不是spring包的。
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Override
    public String getDetail(String id) {
        System.out.println(super.getClass().getName()+"被调用一次："+System.currentTimeMillis());
        return orderDao.getDetail(id);
    }
}
