package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;
    // update 를 위한 dto 변경 - id 필드 추가 및 엔티티 반환 메소드 변경


    public Article toEntity() {
        return new Article(id, title, content);
    }
    // toEntity() 메소드는 새로운 Article 을 생성하는데 기본인 id는 null 로 설정
    // title 과 content 는 dto 에서 전달된 값으로 설정


    // DTO - 데이터 전송객체
    // 계층들 사이에서 데이터를 간단하고 구조화된 방식으로 캡슐화하고 전송하는 것

}
