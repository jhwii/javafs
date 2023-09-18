package study.EndGame.entity;


import lombok.Getter;
import lombok.Setter;
import study.EndGame.dto.AskDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "ask_table")
public class Ask extends BaseEntity {   // 게시판

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String askWriter;

    @Lob
    private String askContent;  // 내용

    @Column(length = 50, nullable = false)
    private String askTitle;  // 제목

    @Column
    private int askHits;   // 조회수


    @OneToMany(mappedBy = "ask", cascade = CascadeType.REMOVE)
    private List<AskComment> comments = new ArrayList<>();

    public static Ask toSaveEntity(AskDto askDto) {
        Ask ask = new Ask();
        ask.setAskWriter(askDto.getAskWriter());
        ask.setAskTitle(askDto.getAskTitle());
        ask.setAskContent(askDto.getAskContent());
        ask.setAskHits(0);
        return ask;
    }


    public static Ask toUpdateEntity(AskDto askDto) {
        Ask ask = new Ask();
        ask.setId(askDto.getId());
        ask.setAskWriter(askDto.getAskWriter());
        ask.setAskTitle(askDto.getAskTitle());
        ask.setAskContent(askDto.getAskContent());
        ask.setAskHits(askDto.getAskHits());
        return ask;
    }
}

