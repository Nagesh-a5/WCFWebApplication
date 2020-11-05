package com.WCF.WCF.Controller;

import com.WCF.WCF.Model.WCFEntity;
import com.WCF.WCF.Model.WCFRequest;
import com.WCF.WCF.Model.WCFResponse;
import com.WCF.WCF.Repository.WCFRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/wcf")
@Slf4j
public class WCFController {

    @Autowired
    WCFRepository wcfRepository;

    @GetMapping(path = "/status")
    public String status(){
        return "working";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path = "/saveData")
    public WCFResponse saveData(@RequestBody WCFRequest wcfRequest){
        WCFEntity wcfEntity = new WCFEntity();
        ModelMapper modelMapper = new ModelMapper();
        wcfEntity = modelMapper.map(wcfRequest, WCFEntity.class);
        log.info(" Data :{}", wcfEntity);
        wcfRepository.save(wcfEntity);
        log.info("Data Saved ");
        WCFResponse wcfResponse = new WCFResponse();
        wcfResponse.setMessage("Data Saved");
        return wcfResponse;
    }
}
