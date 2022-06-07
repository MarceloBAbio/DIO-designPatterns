package com.patternsinspring.model;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
