package com.cbsgenesis.trmsystem.dao;

import com.cbsgenesis.trmsystem.model.Workplace;

import java.util.UUID;

/**
 * Extension of {@link GenericDAO} interface for {@link Workplace} class.
 *
 */
public interface WorkplaceDAO extends GenericDAO<Workplace, UUID> {
    Workplace findByName(String name);
}
