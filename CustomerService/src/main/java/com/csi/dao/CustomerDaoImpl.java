package com.csi.dao;

import com.csi.model.Customer;
import com.csi.repo.CustomerRepo;
import com.csi.vo.Orders;
import com.csi.vo.Product;
import com.csi.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRepo customerRepoImpl;

    @Autowired
    RestTemplate restTemplate;

    public Customer saveData(Customer customer) {
        return customerRepoImpl.save(customer);
    }

    public RestTemplateVO getDataById(long custId) {
        RestTemplateVO restTemplateVO=new RestTemplateVO();
        Customer customer=customerRepoImpl.findByCustId(custId);
        Product product=restTemplate.getForObject("http://ProductService/products/" + customer.getProductId(), Product.class);
        Orders orders=restTemplate.getForObject("http://OrderService/orders/" + customer.getOrderId(), Orders.class);

        restTemplateVO.setCustomer(customer);
        restTemplateVO.setProduct(product);
        restTemplateVO.setOrders(orders);
        return restTemplateVO;

    }
}
