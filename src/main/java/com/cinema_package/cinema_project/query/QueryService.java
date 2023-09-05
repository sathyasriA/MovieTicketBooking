package com.cinema_package.cinema_project.query;

import com.cinema_package.cinema_project.CinemaProjectApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class QueryService {

    private final FeedbackRepository queryRepository;
    public QueryService(FeedbackRepository queryRepository) {
        this.queryRepository = queryRepository;
    }


    @PostMapping
    public void addQuery(@RequestBody CinemaProjectApplication.QueryRequest request) {
        Feedback query = new Feedback();
        query.setFirstName(request.firstName());
        query.setLastName(request.lastName());
        query.setEmail(request.email());
        query.setContactNumber(request.contactNumber());
        query.setMessage(request.messsage());
        queryRepository.save(query);
    }
}