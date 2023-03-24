package com.rpro.confixport.model.adapter.outbound;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OutboundConfig {
    private String storeData;
    private Integer rootScenarioID;
    private OutboundHeader header;

}
