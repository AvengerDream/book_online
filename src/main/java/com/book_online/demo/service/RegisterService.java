package com.book_online.demo.service;

import com.book_online.demo.model.CustomerInfo;

import java.security.NoSuchAlgorithmException;

public interface RegisterService {
    String register(CustomerInfo customerInfo) throws NoSuchAlgorithmException;
}
