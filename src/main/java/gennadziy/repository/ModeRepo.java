package gennadziy.repository;

import gennadziy.model.Mode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeRepo extends JpaRepository<Mode, Integer> {
}
