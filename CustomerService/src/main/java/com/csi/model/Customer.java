package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id

    private long custId;

    private String custName;

    private String custAddress;

    private long custContactNumber;

    private long productId;

    private long orderId;
}
