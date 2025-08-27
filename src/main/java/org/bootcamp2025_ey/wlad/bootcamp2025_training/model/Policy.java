package org.bootcamp2025_ey.wlad.bootcamp2025_training.model;

import jakarta.persistence.*;

@Entity
public class Policy extends BaseEntity {

    private String policyNumber;

    @ManyToOne
    @JoinColumn(name = "insured_id")
    private Insured insured;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }
}
