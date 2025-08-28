package org.bootcamp2025_ey.wlad.bootcamp2025_training.services;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Insured;
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

    public Policy createPolicy(Policy policy, Long id) {
        Insured insured = insuredsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Insured not found"));
        policy.setInsured(insured);

        Policy savedPolicy = policyRepository.save(policy);

        insured.getPolicies().add(savedPolicy);
        insuredsRepository.save(insured);

        return savedPolicy;
    }

    public List<Policy> getPoliciesInCity(String city) {
        return policyRepository.findByInsuredCustomerAddressCity(city);
    }
}
