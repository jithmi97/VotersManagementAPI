package com.voters_api_master.voters_management.controller;
import com.voters_api_master.voters_management.model.ManagementModel;
import com.voters_api_master.voters_management.service_implementation.ManagementImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController

@CrossOrigin("*")
public class ManagementController {

    @Autowired
    private ManagementImplementation managementImplementation;

    @PostMapping(value = "registerVoter")
    public ManagementModel saveCatalog(@RequestBody ManagementModel managementModel){
        System.out.println("Voter is registered successfully");
        managementImplementation.registerVoter((managementModel));
        return managementModel;
    }

    @GetMapping(value = "getRegisteredData")
    public List<ManagementModel> getLaunchData(){
        return  managementImplementation.getRegisteredData();
    }

    @GetMapping(value = "getRegisterDataById/{id}")
    public ManagementModel getLaunchDataById(@PathVariable ("id") Long id){
        Optional<ManagementModel> dataRow = managementImplementation.getRegisterDataById(id);
        if(dataRow.isPresent()){
            return dataRow.get();
        }
        return null;
    }

    @PutMapping("updateVoterData")
    public ManagementModel updateVoterData(@RequestBody ManagementModel managementModel){
        return managementImplementation.updateVoterData(managementModel);
    }

    @DeleteMapping("removeVoter")
    public String removeVoter(@RequestParam long id){
        managementImplementation.removeVoter(id);
        return "Voter is  removed!";
    }

}

