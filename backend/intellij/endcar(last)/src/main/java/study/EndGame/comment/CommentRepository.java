package study.EndGame.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import study.EndGame.community.Community;

import java.util.List;


public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    // select * from comment_table where board_id=? order by id desc;
    List<CommentEntity> findAllByCommunityOrderByIdDesc(Community community);
}