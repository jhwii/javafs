package study.EndGame.entity;

import lombok.Getter;
import lombok.Setter;
import study.EndGame.dto.AskCommentDto;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "comments")
public class AskComment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String commentWriter;

    @Column
    private String commentContent;

    /* Board:Comment = 1:N */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Ask ask;


    public static AskComment toSaveEntity(AskCommentDto askCommentDto, Ask ask) {
        AskComment commentEntity = new AskComment();
        commentEntity.setCommentWriter(askCommentDto.getCommentWriter());
        commentEntity.setCommentContent(askCommentDto.getCommentContent());
        commentEntity.setAsk(ask);
        return commentEntity;
    }
}