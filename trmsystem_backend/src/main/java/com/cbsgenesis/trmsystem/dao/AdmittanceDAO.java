package com.cbsgenesis.trmsystem.dao;

import com.cbsgenesis.trmsystem.model.Admittance;

import java.util.UUID;

/**
 * Extension of {@link GenericDAO} interface for {@link Admittance} class.
 *
 */

public interface AdmittanceDAO extends GenericDAO<Admittance, UUID> {
    Admittance findByName(String name);
}
