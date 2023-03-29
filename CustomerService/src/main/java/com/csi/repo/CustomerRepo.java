package com.csi.repo;

import com.csi.model.Customer;
import com.csi.vo.RestTemplateVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

    public Customer findByCustId(long custId);


}
