package org.py.repository;

import org.py.model.Bigtable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BigtableDao extends JpaRepository<Bigtable, Long> {
}
