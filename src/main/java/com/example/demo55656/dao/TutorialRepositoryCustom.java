/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo55656.dao;

import com.example.demo55656.domainmodel.Tutorial;

/**
 *
 * @author Provider sumbo
 */
public interface TutorialRepositoryCustom {
    public Tutorial update(String id, Tutorial tutorial);
    public Tutorial deleteTutorial(String id);
    
}
