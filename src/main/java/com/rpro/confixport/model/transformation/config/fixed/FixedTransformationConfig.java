package com.rpro.confixport.model.transformation.config.fixed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.rpro.confixport.model.transformation.config.TransformationConfig;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FixedTransformationConfig extends TransformationConfig {
    private String value;
}
