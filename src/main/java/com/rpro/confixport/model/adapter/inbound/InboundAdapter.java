package com.rpro.confixport.model.adapter.inbound;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class InboundAdapter {
    private String id;
    private static final String type = "INBOUND";
    private String subtype;
    private InboundConfig config;
}
