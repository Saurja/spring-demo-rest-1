package org.saurja.demorestapi.controller;

import org.saurja.demorestapi.model.JobPost;
import org.saurja.demorestapi.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping(path="job-posts",produces = {"application/json"})
    public List<JobPost> getAllJobs() {
        return jobService.getJobs();
    }

    @GetMapping("job-posts/{id}")
    public JobPost getJobById(@PathVariable int id) {
        return jobService.getJobPost(id);
    }

    @PostMapping("job-posts")
    public JobPost saveJobPost(@RequestBody JobPost jobPost) {
        jobService.addJobPost(jobPost);
        return jobService.getJobPost(jobPost.getPostId());
    }

    @PutMapping("job-posts")
    public JobPost updateJobPost(@RequestBody JobPost jobPost) {
        jobService.updateJobPost(jobPost);
        return jobService.getJobPost(jobPost.getPostId());
    }

    @DeleteMapping("job-posts/{id}")
    public void deleteJobPost(@PathVariable int id) {
        jobService.deleteJobPost(id);
    }
}
