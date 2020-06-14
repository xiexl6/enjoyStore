package com.enjoy.dao.impl;

import com.enjoy.dao.OrderDao;
import org.springframework.stereotype.Service;

@Service
public class OrderDaoImpl implements OrderDao {
    @Override
    public String getDetail(String id) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "订单金额600元";
    }
}
