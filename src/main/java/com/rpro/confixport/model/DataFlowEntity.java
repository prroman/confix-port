package com.rpro.confixport.model;

import com.rpro.confixport.model.adapter.inbound.InboundAdapter;
import com.rpro.confixport.model.adapter.outbound.OutboundAdapter;
import com.rpro.confixport.model.transformation.TransformationAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DataFlowEntity {
    private String id;
    private String name;
    private String description;
    private Boolean active;
    private Boolean scheduled;
    private Boolean immediateResponse;
    private List<InboundAdapter> inboundAdapters;
    private List<OutboundAdapter> outboundAdapters;
    private List<String> parameters;
    private List<TransformationAdapter> transformationAdapters;
    private Metadata metadata;

}
