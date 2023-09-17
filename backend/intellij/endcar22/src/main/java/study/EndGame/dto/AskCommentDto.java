package study.EndGame.dto;

import lombok.Getter;
import lombok.Setter;
import study.EndGame.entity.AskComment;

import java.time.LocalDateTime;

@Getter
@Setter
public class AskCommentDto {
    private Long id;
    private String commentWriter;
    private  String commentContent;
    private Long askId;
    private LocalDateTime regTime;

    public static AskCommentDto toCommentDTO(AskComment AskComment, Long askId) {
        AskCommentDto askCommentDto = new AskCommentDto();
        askCommentDto.setId(AskComment.getId());
        askCommentDto.setCommentWriter(AskComment.getCommentWriter());
        askCommentDto.setCommentContent(AskComment.getCommentContent());
        askCommentDto.setRegTime(AskComment.getRegTime());
        askCommentDto.setAskId(askId);
        return askCommentDto;
    }
}
