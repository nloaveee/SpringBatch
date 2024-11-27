package study.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.springbatch.entity.AfterEntity;

public interface AfterRepository extends JpaRepository<AfterEntity, Long> {
}
