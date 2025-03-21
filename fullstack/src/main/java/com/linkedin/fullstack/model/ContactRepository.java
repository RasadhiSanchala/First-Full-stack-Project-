package com.linkedin.fullstack.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "contacts")
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
