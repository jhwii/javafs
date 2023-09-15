package study.EndGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.EndGame.entity.Ask;
import study.EndGame.entity.AskComment;

import java.util.List;


public interface AskCommentRepository extends JpaRepository<AskComment, Long> {
    List<AskComment> findAllByAskOrderByIdDesc(Ask ask);
}
