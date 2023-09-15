package study.EndGame.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import study.EndGame.entity.Ask;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AskDto {
    private Long id;
    private String askWriter;//작가
    private String askPass;
    private String askContent; // 내용
    private String askTitle; // 제목
    private int askHits; //조회수
    private LocalDateTime askRegTime; //올린 시간
    private LocalDateTime askUpdateTime; //수정 시간

    public static AskDto toAskDto(Ask ask) {
        AskDto askDto = new AskDto();

        askDto.setId(ask.getId());
        askDto.setAskContent(ask.getAskWriter());
        askDto.setAskTitle(ask.getAskTitle());
        askDto.setAskContent(ask.getAskContent());
        askDto.setAskHits(ask.getAskHits());
        askDto.setAskUpdateTime(ask.getUpdateTime());
        askDto.setAskRegTime(ask.getRegTime());
        return askDto;
    }
}