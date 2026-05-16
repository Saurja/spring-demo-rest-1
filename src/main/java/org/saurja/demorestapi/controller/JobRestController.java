package org.saurja.demorestapi.controller;

import org.saurja.demorestapi.model.JobPost;
import org.saurja.demorestapi.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("job-posts")
    public List<JobPost> getAllJobs(){
        return jobService.getJobs();
    }
}
