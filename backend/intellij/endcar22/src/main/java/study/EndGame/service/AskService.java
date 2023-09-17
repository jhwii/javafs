package study.EndGame.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.EndGame.dto.AskDto;
import study.EndGame.entity.Ask;
import study.EndGame.repository.AskRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AskService {

    private final AskRepository askRepository;

    public void save(AskDto askDto) {
        Ask ask = Ask.toSaveEntity(askDto);
        askRepository.save(ask);
    }

    public Page<AskDto> findAll(Pageable pageable) {
        Page<Ask> askPage = askRepository.findAll(pageable);
        return askPage.map(AskDto::toAskDto);
    }

    @Transactional
    public void updateHits(Long id) {
        askRepository.updateHits(id);
    }

    public AskDto findById(Long id) {
        Optional<Ask> optionalAsk = askRepository.findById(id);
        if (optionalAsk.isPresent()) {
            Ask ask = optionalAsk.get();
            AskDto askDto = AskDto.toAskDto(ask);
            return askDto;
        } else {
            return null;
        }
    }

    public AskDto update(AskDto askDto) {
        Ask ask = Ask.toUpdateEntity(askDto);
        askRepository.save(ask);
        return findById(ask.getId());
    }

    @Transactional
    public void delete(Long askId) {
        askRepository.deleteById(askId);
    }

    public void saveAsk(Ask ask) {
        askRepository.save(ask);
    }

    public Page<AskDto> search(String keyword, Pageable pageable) {
        Page<Ask> askPage = askRepository. findByAskTitleContainingIgnoreCase(keyword, pageable);
        return askPage.map(AskDto::toAskDto);

    }
}
