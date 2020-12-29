package com.shopping.demo.service;

import com.shopping.demo.mbg.model.UmsAdmin;
import com.shopping.demo.mbg.model.UmsPermission;

import java.util.List;

public interface UmsAdminService {
    UmsAdmin getAdminByUsername(String username);
    UmsAdmin register(UmsAdmin umsAdminParam);
    String login(String username, String password);
    List<UmsPermission> getPermissionList(Long adminId);
}
