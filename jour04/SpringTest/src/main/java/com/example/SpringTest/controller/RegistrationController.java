package com.example.SpringTest.controller;

import com.example.SpringTest.domain.AppUser;
import com.example.SpringTest.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("appUser", new AppUser());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("appUser") AppUser appUser, Model model) {
        if (appUserRepository.findByUsername(appUser.getUsername()) != null) {
            model.addAttribute("error", "Nom d'utilisateur déjà utilisé");
            return "register";
        }
        // Encodage du mot de passe avant enregistrement
        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        // Rôle par défaut
        appUser.setRole("USER");
        appUserRepository.save(appUser);
        return "redirect:/login?registered";
    }
}