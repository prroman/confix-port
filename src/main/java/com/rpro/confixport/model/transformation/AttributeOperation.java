package com.rpro.confixport.model.transformation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.rpro.confixport.model.transformation.config.TransformationConfig;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AttributeOperation {

    private String operationId;
    private String type;
    private String attribute;
    private TransformationConfig config;
}
