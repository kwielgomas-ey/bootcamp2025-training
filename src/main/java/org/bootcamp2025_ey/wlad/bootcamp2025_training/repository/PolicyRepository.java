package org.bootcamp2025_ey.wlad.bootcamp2025_training.repository;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
    List<Policy> findByInsuredCustomerAddressCity(String city);
}
