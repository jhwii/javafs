package study.EndGame.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import study.EndGame.entity.Ask;


@Repository
public interface AskRepository extends JpaRepository<Ask,Long> {
    @Modifying
    @Query(value = "update Ask b set b.askHits=b.askHits+1 where b.id=:id")
    void updateHits(@Param("id") Long Id);

    Page<Ask> findByAskTitleContainingIgnoreCase(String keyword, Pageable pageable);
}
