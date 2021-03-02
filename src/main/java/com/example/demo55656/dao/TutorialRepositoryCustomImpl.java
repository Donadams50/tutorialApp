/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo55656.dao;

import com.example.demo55656.domainmodel.Tutorial;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 *
 * @author Provider sumbo
 */
public class TutorialRepositoryCustomImpl implements TutorialRepositoryCustom{
      @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Tutorial update(String id, Tutorial tutorial) {
        Query query = new Query(Criteria.where("_id").is(id));
        List<Tutorial> updatetutorial = mongoTemplate.find(query, Tutorial.class);
        if(updatetutorial.size()>0){
            Update update = new Update();
            update.set("title", tutorial.getTitle());
            update.set("description", tutorial.getDescription());
            update.set("published", tutorial.getPublished());
            return mongoTemplate.findAndModify(query, update, Tutorial.class);
        }else{
            return tutorial;
        }
    }
    
    @Override
    public Tutorial deleteTutorial(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        List<Tutorial> deletetutorial = mongoTemplate.find(query, Tutorial.class);
        if(deletetutorial.size()>0){
            mongoTemplate.remove(query, Tutorial.class);
            return deletetutorial.get(0);
        }
        return deletetutorial.get(0);
    }

}
