package com.rpro.confixport.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Metadata {
    private String createdBy;
    private String updatedBy;
    private String createdAt;
    private String updatedAt;

}
