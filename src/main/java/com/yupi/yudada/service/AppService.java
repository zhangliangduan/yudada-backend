package com.yupi.yudada.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yudada.model.dto.app.AppQueryRequest;
import com.yupi.yudada.model.entity.App;
import com.yupi.yudada.model.vo.AppVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 应用服务
 */
public interface AppService extends IService<App> {

    /**
     * 校验数据
     *
     */
    void validApp(App app, boolean add);

    /**
     * 获取查询条件
     *
     */
    QueryWrapper<App> getQueryWrapper(AppQueryRequest appQueryRequest);
    
    /**
     * 获取应用封装
     *
     */
    AppVO getAppVO(App app, HttpServletRequest request);

    /**
     * 分页获取应用封装
     */
    Page<AppVO> getAppVOPage(Page<App> appPage, HttpServletRequest request);
}
