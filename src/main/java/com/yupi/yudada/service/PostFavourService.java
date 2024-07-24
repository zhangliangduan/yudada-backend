package com.yupi.yudada.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yudada.model.entity.Post;
import com.yupi.yudada.model.entity.PostFavour;
import com.yupi.yudada.model.entity.User;

/**
 * 帖子收藏服务
 *
 */
public interface PostFavourService extends IService<PostFavour> {

    /**
     * 帖子收藏
     *
     */
    int doPostFavour(long postId, User loginUser);

    /**
     * 分页获取用户收藏的帖子列表
     *
     */
    Page<Post> listFavourPostByPage(IPage<Post> page, Wrapper<Post> queryWrapper,
            long favourUserId);

    /**
     * 帖子收藏（内部服务）
     *
     */
    int doPostFavourInner(long userId, long postId);
}
