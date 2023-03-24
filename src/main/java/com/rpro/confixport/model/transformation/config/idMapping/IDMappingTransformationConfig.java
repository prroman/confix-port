package com.rpro.confixport.model.transformation.config.idMapping;

import com.rpro.confixport.model.transformation.config.TransformationConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IDMappingTransformationConfig extends TransformationConfig {
    private String idMappingType;
    private IDMappingTransformationConfigurationConfig config;

}

