package org.appMVC.controller;

import org.appMVC.model.Music;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // Marking this class as a web controller.
public class MusicController {

    // Getting Routes like /home, basically a get request.
    @GetMapping("/upload")
    public String uploadMusic(Model model){ // Model is a class Spring provides, it acts as a Data carrier.
        model.addAttribute("music", new Music());
        return "upload"; // Name of JSP file
    }

    @PostMapping("/upload")
    public String handleUpload(@ModelAttribute Music music, Model model){
        model.addAttribute("message"+ music.getMusic_name() + "." + music.getMusic_file_type()+" - Uploaded successfully");
        return "success";
    }
}
