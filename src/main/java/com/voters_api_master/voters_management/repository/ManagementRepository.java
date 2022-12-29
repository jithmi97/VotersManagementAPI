package com.voters_api_master.voters_management.repository;
import com.voters_api_master.voters_management.model.ManagementModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagementRepository extends CrudRepository<ManagementModel,Long> {
}