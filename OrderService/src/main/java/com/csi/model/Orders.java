package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    @Id
    private long orderId;

    private String orderCode;

    private double orderTotalPrice;

    @JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/kolkata")
    private Date orderLaunchDate;
}
