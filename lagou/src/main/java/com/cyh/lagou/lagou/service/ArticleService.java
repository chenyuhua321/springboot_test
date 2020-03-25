package com.cyh.lagou.lagou.service;

import com.cyh.lagou.lagou.pojo.Article;
import org.springframework.data.domain.Page;

/**
 * @author Chenyuhua
 * @date 2020/3/25 11:31
 */
public interface ArticleService {
    Page<Article> listArticle(int pageNum, int pageSize);
}
