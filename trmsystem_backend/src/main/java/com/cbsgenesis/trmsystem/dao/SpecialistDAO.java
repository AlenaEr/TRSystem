package com.cbsgenesis.trmsystem.dao;

import com.cbsgenesis.trmsystem.model.Specialist;

import java.util.UUID;

/**
 * Extension of {@link GenericDAO} interface for {@link Specialist} class.

 */

public interface SpecialistDAO extends GenericDAO<Specialist, UUID> {

    Specialist findByName(String lastName);

}
