package study.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.springbatch.entity.BeforeEntity;

public interface BeforeRepository extends JpaRepository<BeforeEntity, Long> {
}
