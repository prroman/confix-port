package com.rpro.confixport.model.dto;

import com.rpro.confixport.model.adapter.inbound.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AttributeDto {
    private List<Attribute> attributes = new ArrayList<>();
    public void addAttribute(Attribute attribute) {
        this.attributes.add(attribute);
    }

}
