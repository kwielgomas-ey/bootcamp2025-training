package org.bootcamp2025_ey.wlad.bootcamp2025_training.controlers;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Policy;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.services.PolicyService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policies")
public class PolicyController {
    private final PolicyService policyService;

    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @GetMapping
    public List<Policy> getAllPolicies(){
        return policyService.getAllPolicies();
    }

    @PostMapping("/insured/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Policy createPolicy(@RequestBody Policy policy, @PathVariable Long id){
        return policyService.createPolicy(policy, id);
    }

    @GetMapping("/city/{city}")
    public List<Policy> getPoliciesInCity(@PathVariable String city){
        return policyService.getPoliciesInCity(city);
    }
}
