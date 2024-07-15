package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.JobTitle;
import com.thebao.fleetapp.repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {
    @Autowired
    private JobTitleRepository jobTitleRepository;

    public List<JobTitle> getJobTitles(){
        return jobTitleRepository.findAll();
    }

    public List<JobTitle> findAll() {
        return jobTitleRepository.findAll();
    }

    public void save(JobTitle  jobtitle){
        jobTitleRepository.save(jobtitle);
    }

    //Get by id
    public Optional<JobTitle> findById(int id){
        return jobTitleRepository.findById(id);
    }

    public void update(JobTitle  jobtitle) {
        jobTitleRepository.save(jobtitle);
    }

    public void deleteById(Integer id){
        jobTitleRepository.deleteById(id);
    }
}
