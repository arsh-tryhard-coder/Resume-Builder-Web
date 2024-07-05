package com.r_web.RWB.Controller;


import com.r_web.RWB.Entity.Resume;
import com.r_web.RWB.Repository.ResumeRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;



    @Controller
    @RequestMapping("/resume")
    public class ResumeController {

        @Autowired
        private ResumeRepository resumeRepository;

        @GetMapping("/templates")
        public String showTemplates() {
            return "templates";
        }

        @GetMapping("/create")
        public String createResume(Model model) {
            model.addAttribute("resume", new Resume());
            return "resume";
        }

        @PostMapping("/create")
        public String handleResumeCreation(@ModelAttribute Resume resume) {
            resume.setCreatedDate((java.sql.Date) new Date());
            resumeRepository.save(resume);
            return "redirect:/resume/view/" + resume.getId();
        }

        @GetMapping("/view/{id}")
        public String viewResume(@PathVariable Long id, Model model) {
            Optional<Resume> resume = resumeRepository.findById(id);
            if (resume.isPresent()) {
                model.addAttribute("resume", resume.get());
                return "view-resume";
            } else {
                return "redirect:/resume/templates";
            }
        }

    }




