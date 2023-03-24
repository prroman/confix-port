package com.rpro.confixport.model.transformation.config;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.rpro.confixport.model.transformation.config.fixed.FixedTransformationConfig;
import com.rpro.confixport.model.transformation.config.idMapping.IDMappingTransformationConfig;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = FixedTransformationConfig.class, name = "Fixed"),
        @JsonSubTypes.Type(value = IDMappingTransformationConfig.class, name = "IDMapping")
})
public abstract class TransformationConfig {

}
