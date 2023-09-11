package study.EndGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.EndGame.entity.Community;

public interface CommunityRepository extends JpaRepository<Community, Long> {
}
