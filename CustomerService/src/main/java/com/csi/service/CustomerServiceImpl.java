package com.csi.service;

import com.csi.dao.CustomerDaoImpl;
import com.csi.model.Customer;
import com.csi.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {
    @Autowired
    CustomerDaoImpl customerDaoImpl;


    public Customer save(Customer customer) {
        return customerDaoImpl.saveData(customer);
    }

    public RestTemplateVO getDataById(long custId) {
        return customerDaoImpl.getDataById(custId);
    }
}
