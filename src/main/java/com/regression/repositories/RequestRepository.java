package com.regression.repositories;

import com.regression.models.Request;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by purushtoman on 5/6/17.
 */

public  interface RequestRepository extends CrudRepository<Request, Long> {
    Request findById(int id);
}
