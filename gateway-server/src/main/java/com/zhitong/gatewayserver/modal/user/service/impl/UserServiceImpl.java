package com.zhitong.gatewayserver.modal.user.service.impl;

import com.zhitong.gatewayserver.modal.user.entity.User;
import com.zhitong.gatewayserver.modal.user.mapper.UserMapper;
import com.zhitong.gatewayserver.modal.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author su
 * @since 2020-12-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
