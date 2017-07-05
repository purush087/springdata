package com.regression.services;

import com.regression.models.Goal;
import com.regression.models.Request;
import com.regression.models.User;
import com.regression.repositories.GoalRepository;
import com.regression.repositories.RequestRepository;
import com.regression.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;


/**
 * Created by purushtoman on 7/6/17.
 */
@Component
public class RequestService {

    private static final Logger log = LoggerFactory.getLogger(RequestService.class);

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private GoalRepository goalRepository;

    @Autowired
    private UserRepository userRepository;

    public void insertRequestAndGoals() throws ParseException {


//        for (int i= 1;i<15;i++){
//            userRepository.save(new User(1,1));
//            userRepository.save(new User(i+15,2));
//        }
        //save a couple of requests and goals
        List<User> mentors = userRepository.findByRole(2);
        List<User> mentees = userRepository.findByRole(1);


        int menteeCount = mentees.size();
        int menteeId[] = new int[menteeCount];

        int i=1;

        for(User mentee : mentees){
            menteeId[i] = mentee.getUserId();
            i++;
        }

        i=1;
        Date date = new Date();
        for(User mentor: mentors) {
                requestRepository.save(new Request(menteeId[i],i, mentor.getUserId(), 0, date, date));
                goalRepository.save(new Goal(i,null, "Goal Title - " + i, "Goal Description - "
                        +i, date, date, 67, 2, date, date));
                i++;
        }

        int users = mentors.size();
        i=1;
        for(User mentor:mentors){
            requestRepository.save(new Request(menteeId[i],i,mentor.getUserId(),0,date,date));
            goalRepository.save(new Goal(menteeId[i],null,"Goal Title - "+users+i,"Goal Description - "+users+i,date,date,67,2,date,date));
            i++;
        }

        //Find all requests        log.info("Requests found with findAll():");
        log.info("----------------------------------");

        for (Request request : requestRepository.findAll()) {
            log.info(request.toString());
        }

        log.info("");

        for(Goal goal: goalRepository.findAll()){
            log.info(goal.toString());
        }

        log.info("");

//        for (User user: userRepository.findByRole(2)){
//            log.info(user.toString());
//        }
    }
}
