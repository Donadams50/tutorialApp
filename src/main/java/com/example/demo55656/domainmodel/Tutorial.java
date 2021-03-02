/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo55656.domainmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Provider sumbo
 */
@Document("tutorial_collection")
public class Tutorial {
    @Id
    private String id;
    private String title;
    private String description;
    private Boolean published;
    
    

    public Tutorial() {
    }

    public Tutorial(String id,  String title, String description, Boolean published) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.published = published;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }
    
    
  
    
}



/**
 *
 * @author oreme
 */


