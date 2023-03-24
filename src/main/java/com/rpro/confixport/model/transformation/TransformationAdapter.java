package com.rpro.confixport.model.transformation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TransformationAdapter {

    private String id;
    private String dataflowId;
    private Integer priority;
    private String rootEntity;
    private List<EntityOperation> entityOperations;
    private List<FilterOperation> filterOperations;
    private List<AttributeOperation> attributeOperations;
}
