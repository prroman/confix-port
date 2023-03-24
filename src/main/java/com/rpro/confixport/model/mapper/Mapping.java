package com.rpro.confixport.model.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Mapping {
    private String InboundColumn;
    private String OutboundColumn;
}
