package com.rpro.confixport.controller;

import com.rpro.confixport.model.adapter.inbound.Attribute;
import com.rpro.confixport.model.dto.AttributeDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DataFlowController {

    private AttributeDto attributeDto;

    public DataFlowController() {
        this.attributeDto = new AttributeDto();
    }

    @GetMapping("/attributes")
    public String getAttributesPage(Model model) {
        AttributeDto attributeDto = new AttributeDto();
        attributeDto.addAttribute(new Attribute());
        model.addAttribute("attributeForm", attributeDto);
        model.addAttribute("attributes", this.attributeDto.getAttributes());
        return "index";
    }

    @PostMapping("/attributes/save")
    public String saveBooks(@ModelAttribute AttributeDto form, Model model) {
        System.out.println(form);
        for (int i = 0; i < form.getAttributes().size(); i++) {
            this.attributeDto.addAttribute(form.getAttributes().get(i));
        }
        return "redirect:/attributes";
    }

}
