package com.regression.repositories;

import com.regression.models.Goal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by purushtoman on 6/6/17.
 */
public interface GoalRepository extends CrudRepository<Goal, Long>{
    Goal findByGoalId(int id);
}
