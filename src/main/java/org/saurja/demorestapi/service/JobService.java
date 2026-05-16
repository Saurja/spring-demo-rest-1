package org.saurja.demorestapi.service;

import org.saurja.demorestapi.model.JobPost;
import org.saurja.demorestapi.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo  jobRepo;

    public List<JobPost> getJobs(){
        return jobRepo.getJobs();
    }

    public void addJobPost(JobPost jobPost){
        jobRepo.addJobPost(jobPost);
    }

}
