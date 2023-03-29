package com.csi.service;


import com.csi.dao.OrdersDaoImpl;
import com.csi.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdersServiceImpl {
    @Autowired
    OrdersDaoImpl ordersDaoImpl;


    public Orders saveData(Orders orders) {
        return ordersDaoImpl.saveData(orders);
    }


    public Optional<Orders> getDataById(long orderId) {
        return ordersDaoImpl.getDataById(orderId);
    }
}
