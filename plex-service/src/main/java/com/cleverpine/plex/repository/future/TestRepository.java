package com.cleverpine.plex.repository.future;

import com.cleverpine.plex.entity.future.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Integer> {
}
