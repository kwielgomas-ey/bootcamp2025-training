package org.bootcamp2025_ey.wlad.bootcamp2025_training.repository;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
}
