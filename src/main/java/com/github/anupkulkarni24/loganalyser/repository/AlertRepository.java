package com.github.anupkulkarni24.loganalyser.repository;

import com.github.anupkulkarni24.loganalyser.model.persistence.Alert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
