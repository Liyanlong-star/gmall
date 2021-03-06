package com.gmall.service;

import com.gmall.bean.UserAddress;
import com.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> getUserInfoList();

    UserInfo login(UserInfo userInfo);

    UserInfo verify(String userId);

    List<UserAddress> getUserAddressList(String userId);
}
