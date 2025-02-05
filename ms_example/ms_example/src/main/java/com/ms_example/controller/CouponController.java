package com.ms_example.controller;

import com.coupon.dto.Coupon;
import com.coupon.service.CouponService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class CouponController {
        private CouponService couponService;

        public CouponController(CouponService couponService) {
            this.couponService = couponService;
        }
        //http://localhost:8083/coupon/SUP10
        @GetMapping("coupon/{couponCode}")
        public Coupon getCouponByCode(@PathVariable String couponCode) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
            return couponServicel.getCouponByCode(couponCode);
        }
    }
