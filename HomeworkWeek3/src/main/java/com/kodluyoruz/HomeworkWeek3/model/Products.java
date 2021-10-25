package com.kodluyoruz.HomeworkWeek3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;
//import java.lang.*;


import javax.management.modelmbean.DescriptorSupport;

@AllArgsConstructor
@Builder
@Getter
public class Products {
    private final String name;
    private final String desc;
    private double price;

}
