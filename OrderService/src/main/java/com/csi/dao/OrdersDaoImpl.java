package com.csi.dao;

import com.csi.model.Orders;
import com.csi.repo.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrdersDaoImpl {

    @Autowired
    OrdersRepo ordersRepoImpl;

    public Orders saveData(Orders orders){
        return ordersRepoImpl.save(orders);
    }




    public Optional<Orders> getDataById(long orderId){
        return ordersRepoImpl.findById(orderId);
    }
}
