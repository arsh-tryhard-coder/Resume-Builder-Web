package com.r_web.RWB.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/details")
public class DetailsController {
    @GetMapping
    public String getDetails(Model model) {
        // Initialize the details object
        UserInputDetails details = new UserInputDetails();

        // Add the details object to the model
        model.addAttribute("details", details);

        // Render the details page
        return "details";
    }

    @PostMapping
    public String saveDetails(@ModelAttribute UserInputDetails details, Model model) {
        // Save the details to the database or session
        //...

        // Redirect to the resume final page
        return "redirect:/resume/final";
    }
}