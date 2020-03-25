package com.cyh.lagou.lagou.service.impl;

import com.cyh.lagou.lagou.dao.ArticleDao;
import com.cyh.lagou.lagou.pojo.Article;
import com.cyh.lagou.lagou.service.ArticleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Chenyuhua
 * @date 2020/3/25 11:10
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;

    @Override
    public Page<Article> listArticle(int pageNum, int pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<Article> articles = articleDao.findAll(pageable);
        return articles;
    }
}
