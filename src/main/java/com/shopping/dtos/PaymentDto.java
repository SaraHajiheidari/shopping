package com.shopping.dtos;

import com.shopping.models.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private Long payment_ID;
    private Category category_ID;
    private Date date;

}
