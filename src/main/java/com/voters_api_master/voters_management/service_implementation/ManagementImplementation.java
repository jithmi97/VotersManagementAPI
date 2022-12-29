package com.voters_api_master.voters_management.service_implementation;


import java.util.Optional;
import com.voters_api_master.voters_management.model.ManagementModel;
import com.voters_api_master.voters_management.repository.ManagementRepository;
import com.voters_api_master.voters_management.service_interface.ManagementInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementImplementation implements ManagementInterface {

    @Autowired
    private ManagementRepository managementRepository;
    @Override
    public ManagementModel registerVoter(ManagementModel managementModel) {
        return managementRepository.save(managementModel);
    }

    @Override
    public ManagementModel updateVoterData(ManagementModel managementModel) {
        ManagementModel existingManagementModel = managementRepository.findById(managementModel.getVoters_NIC()).orElse(null);
        existingManagementModel.setStatus(managementModel.getStatus());
        existingManagementModel.setRegisteredDate(managementModel.getRegisteredDate());
        return managementRepository.save(existingManagementModel);

    }

    @Override
    public List<ManagementModel> getRegisteredData() {
        return (List<ManagementModel>) managementRepository.findAll();
    }

    @Override
    public Optional<ManagementModel> getRegisterDataById(long id) {
        return (Optional<ManagementModel>) managementRepository.findById(id);
    }

    @Override
    public void removeVoter(long id) {
        managementRepository.deleteById(id);

    }
}
