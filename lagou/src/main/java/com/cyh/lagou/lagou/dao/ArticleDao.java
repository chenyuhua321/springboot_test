package com.cyh.lagou.lagou.dao;

import com.cyh.lagou.lagou.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Chenyuhua
 * @date 2020/3/25 1:05
 */
public interface ArticleDao extends JpaRepository<Article,Integer> {

}
