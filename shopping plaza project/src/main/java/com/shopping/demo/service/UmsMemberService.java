package com.shopping.demo.service;

import com.shopping.demo.common.api.CommonResult;

public interface UmsMemberService {
    CommonResult generateAuthCode(String telephone);
    CommonResult verifyAuthCode(String telephone, String authCode);
}
