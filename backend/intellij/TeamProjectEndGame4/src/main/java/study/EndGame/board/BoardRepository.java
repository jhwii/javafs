package study.EndGame.board;


import org.springframework.data.jpa.repository.JpaRepository;
import study.EndGame.entity.User;


import java.util.List;

// JpaRepository<Entity 클래스, PK 타입>
public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByTitleContaining(String keyword);

    Board findByUser(User user);
}
