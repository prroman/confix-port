package com.rpro.confixport.model.transformation.config.idMapping;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class IDMappingTransformationConfigurationConfig {
    private String idType;
    private String externalIDPRDID;
    private String adapterID;
    private String connection;
}
