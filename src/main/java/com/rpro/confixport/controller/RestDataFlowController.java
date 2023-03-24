package com.rpro.confixport.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rpro.confixport.model.DataFlowEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDataFlowController {

    @PostMapping("api/v1/create")
    public boolean isCreated(@RequestBody DataFlowEntity dataFlowEntity) throws JsonProcessingException {
        System.out.println(dataFlowEntity);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dataFlowEntity));
        return true;
    }
}
