package org.bootcamp2025_ey.wlad.bootcamp2025_training.repository;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Insured;

import java.util.List;

public interface InsuredCustomDAOJPA {
    List<Insured>  findInsuredsForCity(String City);
}
