package com.xiaobo.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailCodeService {
    public String encryptActiveUrl(Integer userId);
    public Boolean decryptActiveUrl(String url);
}
