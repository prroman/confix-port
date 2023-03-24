package com.rpro.confixport.model.adapter.outbound;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OutboundAdapter {
    private String id;
    private static final String type = "OUTBOUND";
    private String subtype;
    private String systemConfig;
    private OutboundConfig config;
}
