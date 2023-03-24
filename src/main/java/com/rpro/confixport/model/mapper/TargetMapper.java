package com.rpro.confixport.model.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.rpro.confixport.model.adapter.outbound.OutboundAdapter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TargetMapper {

    private String id;
    private String[] transformationId;
    private OutboundAdapter outboundAdapterId;
    private Boolean discardOthers;
    private List<Mapping> mapping;
}
