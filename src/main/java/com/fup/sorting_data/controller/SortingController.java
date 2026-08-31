package com.fup.sorting_data.controller;

import com.fup.sorting_data.model.SortingRequest;
import com.fup.sorting_data.model.SortingResult;
import com.fup.sorting_data.service.SortingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SortingController {

    private final SortingService sortingService;

    public SortingController(SortingService sortingService) {
        this.sortingService = sortingService;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("sortingRequest", new SortingRequest());
        return "index";
    }

    @PostMapping("/sort")
    public String processSort(@ModelAttribute SortingRequest request, Model model) {
        int size = request.getDataSize();
        if (size <= 0) {
            size = 10;
        }

        SortingResult result = sortingService.generateAndSort(size);
        model.addAttribute("result", result);
        model.addAttribute("sortingRequest", new SortingRequest());

        return "index";
    }
}