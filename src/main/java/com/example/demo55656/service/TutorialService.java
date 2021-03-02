/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo55656.service;

import com.example.demo55656.domainmodel.Tutorial;
import java.util.List;

/**
 *
 * @author Provider sumbo
 */
public interface TutorialService {
    public Tutorial createTutorial(Tutorial tutorial);
    public List<Tutorial> fetchAllTutorial();
    public Tutorial updateTutorial(String id, Tutorial tutorial);
    public Tutorial fetchTutorialById(String id);
    public Tutorial deleteTutorialById(String id);
}

