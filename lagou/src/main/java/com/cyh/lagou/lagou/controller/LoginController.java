package com.cyh.lagou.lagou.controller;

import com.cyh.lagou.lagou.pojo.Article;
import com.cyh.lagou.lagou.service.ArticleService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author Chenyuhua
 * @date 2020/3/25 1:19
 */
@Controller
public class LoginController {
    @Resource
    private ArticleService articleService;

    @RequestMapping("/toLoginPage")
    public String toLoginPageModel(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "2") int pageSize) {
        Page<Article> articles = articleService.listArticle(pageNum, pageSize);
        model.addAttribute("articles",
                articles);
        return "client/index";
    }
}
