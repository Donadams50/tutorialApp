/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo55656.service;

import com.example.demo55656.dao.TutorialRepository;
import com.example.demo55656.domainmodel.Tutorial;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Provider sumbo
 */
@Service
public class TutorialServiceImple implements TutorialService {
     @Autowired
    private TutorialRepository tutorialRepository;
    
   

    @Override
    public Tutorial createTutorial(Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }

    @Override
    public List<Tutorial> fetchAllTutorial() {
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial updateTutorial(String id, Tutorial tutorial) {
        return tutorialRepository.update(id, tutorial);
    }

    
    @Override
     public Tutorial fetchTutorialById(String id){
        Optional<Tutorial> tutorialById = tutorialRepository.findById(id);
        return tutorialById.get();
    }
//     
    @Override
    public Tutorial deleteTutorialById(String id) {
        return tutorialRepository.deleteTutorial(id);
    }
}
