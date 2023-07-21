package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

//    private final ArticleRepository articleRepository;
//
//    @Autowired
//    public ArticleController(ArticleRepository articleRepository) {
//        this.articleRepository = articleRepository;
//    }
    @Autowired
    private ArticleRepository articleRepository;
    // 스프링 부트가 미리 생성해놓은 리포지토리 객체를 가져옴(DI)





    @GetMapping("articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("articles/create")
    public String createArticleForm(ArticleForm form){
        System.out.println(form.toString());
        // form 안의 내용을 dto(ArticleForm 이라는 클래스 타입의 객체를 파라미터로 받는다.)

        // 1. Dto 를 Entity 방식으로 변화
        Article article = form.toEntity();
        System.out.println(article.toString());
        // ArticleForm 의 객체를 article 로 변환
        // toEntity() 메소드는 ArticleForm 에서 Article 객체로 데이터를 복사하여 변환

        // 2. Repository 에게 Entity 를 DB로 저장
        Article saved = articleRepository.save(article);
        // Article Entity 를 데이터베이스에 저장



        System.out.println(saved.toString());
        return "";
    }
    // @PostMapping("articles/create") 다음 경로 요청이 들어오면 밑에 있는 메소드로 처리
    // public String createArticleForm(ArticleForm form)
    // ArticleForm 클래스 타입의 객체를 파라미터로 받습니다.

    // System.out.println(form.toString()); ArticleForm 객체의 내용을 콘솔에 출력
}
