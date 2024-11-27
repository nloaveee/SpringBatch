package study.springbatch.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import study.springbatch.entity.WinEntity;

public interface WinRepository extends JpaRepository<WinEntity,Long> {

    Page<WinEntity> findByWinGreaterThanEqual(Long win, Pageable pageable);
}
