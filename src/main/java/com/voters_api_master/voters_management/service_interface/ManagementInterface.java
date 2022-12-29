package com.voters_api_master.voters_management.service_interface;
import java.util.Optional;
import com.voters_api_master.voters_management.model.ManagementModel;
import java.util.List;

public interface ManagementInterface {

    public ManagementModel registerVoter(ManagementModel managementModel);

    public ManagementModel updateVoterData(ManagementModel managementModel);

    public List<ManagementModel> getRegisteredData();

    public Optional<ManagementModel> getRegisterDataById(long id);

    public void removeVoter(long id);
}