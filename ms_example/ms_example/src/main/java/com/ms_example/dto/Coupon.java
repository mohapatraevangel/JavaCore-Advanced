package com.ms_example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public  class Coupon {
        private String couponCode;
        private int discountPercentage;
        private LocalDateTime expiredOn;
    }

