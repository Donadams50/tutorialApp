/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo55656.webservice;

import com.example.demo55656.domainmodel.Tutorial;
import com.example.demo55656.service.TutorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Provider sumbo
 */
  @RestController 
  @RequestMapping("/test")
public class TutorialWebservice {

    
    @Autowired
    private TutorialService  tutorialService;
   
    @PostMapping("/tutorial")
    public Tutorial createTransactionLimit(@RequestBody Tutorial tutorial){
        return tutorialService.createTutorial(tutorial);
    }
    
    @GetMapping("/tutorial")
    public List<Tutorial> fetchAllTutorial(){
        return tutorialService.fetchAllTutorial();
    }
 
    @GetMapping("/tutorial/{tutorialId}")
    public Tutorial fetchTutorialById(@PathVariable("tutorialId") String tutorialId){
        return tutorialService.fetchTutorialById(tutorialId);
    }      
    @PutMapping("/tutorial/{tutorialId}")
    public Tutorial updateTutorial(@PathVariable("tutorialId") String tutorialId, @RequestBody Tutorial tutorial){
         return tutorialService.updateTutorial(tutorialId, tutorial);
    }
        
    @DeleteMapping("/tutorial/{tutorialId}")
    public Tutorial deleteTutorialById(@PathVariable("tutorialId") String tutorialId){
        return tutorialService.deleteTutorialById(tutorialId);
    }
    }
