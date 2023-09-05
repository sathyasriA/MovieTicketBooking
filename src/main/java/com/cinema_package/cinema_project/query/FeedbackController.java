package com.cinema_package.cinema_project.query;

import com.cinema_package.cinema_project.CinemaProjectApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queries")
@CrossOrigin("*")
public class FeedbackController {

    private final QueryService queryService;
    public FeedbackController(QueryService queryService) {
        this.queryService = queryService;
    }

    @PostMapping
    public void addFeedback(@RequestBody CinemaProjectApplication.QueryRequest feedback) {
        queryService.addQuery(feedback);
    }

}