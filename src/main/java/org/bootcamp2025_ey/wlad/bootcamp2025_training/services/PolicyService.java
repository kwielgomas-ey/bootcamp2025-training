package org.bootcamp2025_ey.wlad.bootcamp2025_training.services;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Policy;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.repository.InsuredsRepository;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.repository.PolicyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {
    private final PolicyRepository policyRepository;
    private final InsuredsRepository insuredsRepository;

    public PolicyService(PolicyRepository policyRepository, InsuredsRepository insuredsRepository) {
        this.policyRepository = policyRepository;
        this.insuredsRepository = insuredsRepository;
    }

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy createPolicy(Policy policy) {
        insuredsRepository.save(policy.getInsured());
        return policyRepository.save(policy);
    }
}
