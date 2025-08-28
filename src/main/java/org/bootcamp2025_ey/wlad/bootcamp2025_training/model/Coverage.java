package org.bootcamp2025_ey.wlad.bootcamp2025_training.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Coverage extends BaseEntity{

    private String name;
    private String description;
    private BigDecimal sumCovered;

    @ManyToOne
    private Policy policy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getSumCovered() {
        return sumCovered;
    }

    public void setSumCovered(BigDecimal sumCovered) {
        this.sumCovered = sumCovered;
    }
}
