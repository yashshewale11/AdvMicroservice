package com.csi.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    private long orderId;

    private String orderCode;

    private double oredrTotalPrice;

    @JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")

    private Date orderLaunchDate;
}
