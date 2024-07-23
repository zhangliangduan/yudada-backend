package com.yupi.yudada.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yudada.model.dto.user.UserQueryRequest;
import com.yupi.yudada.model.entity.User;
import com.yupi.yudada.model.vo.LoginUserVO;
import com.yupi.yudada.model.vo.UserVO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 *
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
      * userAccount   用户账户
      * userPassword  用户密码
      * checkPassword 校验密码
     * 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
      * userAccount  用户账户
      * userPassword 用户密码
      * request
     * 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
      * request
     *
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取当前登录用户（允许未登录）
     *
      * request
     *
     */
    User getLoginUserPermitNull(HttpServletRequest request);

    /**
     * 是否为管理员
     *
      * request
     *
     */
    boolean isAdmin(HttpServletRequest request);

    /**
     * 是否为管理员
     *
      * user
     *
     */
    boolean isAdmin(User user);

    /**
     * 用户注销
     *
      * request
     *
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取脱敏的已登录用户信息
     *
     *
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取脱敏的用户信息
     *
      * user
     *
     */
    UserVO getUserVO(User user);

    /**
     * 获取脱敏的用户信息
     *
      * userList
     *
     */
    List<UserVO> getUserVO(List<User> userList);

    /**
     * 获取查询条件
     *
      * userQueryRequest
     *
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

}
