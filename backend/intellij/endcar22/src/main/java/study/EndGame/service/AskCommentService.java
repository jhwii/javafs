package study.EndGame.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.EndGame.dto.AskCommentDto;
import study.EndGame.entity.Ask;
import study.EndGame.entity.AskComment;
import study.EndGame.repository.AskCommentRepository;
import study.EndGame.repository.AskRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AskCommentService {
    private final AskCommentRepository askCommentRepository;
    private final AskRepository askRepository;

    public Long save(AskCommentDto askCommentDto) {
        /* 부모엔티티(BoardEntity) 조회 */
        Optional<Ask> optionalAskEntity = askRepository.findById(askCommentDto.getId());
        if (optionalAskEntity.isPresent()) {
            Ask askEntity = optionalAskEntity.get();
            AskComment commentEntity = AskComment.toSaveEntity(askCommentDto, askEntity);
            return askCommentRepository.save(commentEntity).getId();
        } else {
            return null;
        }
    }

    public List<AskCommentDto> findAll(Long askId) {
        Ask ask = askRepository.findById(askId).get();
        List<AskComment> askCommentList = askCommentRepository.findAllByAskOrderByIdDesc(ask);
        /* EntityList -> DTOList */
        List<AskCommentDto> askCommentDtoList = new ArrayList<>();
        for (AskComment askComment : askCommentList) {
            AskCommentDto askCommentDto = AskCommentDto.toCommentDTO(askComment, askId);
            askCommentDtoList.add(askCommentDto);
        }
        return askCommentDtoList;
    }
}

