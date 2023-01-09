package com.cicd.docker.githubactionsdemo.jobs;

public class JobNotFoundException extends RuntimeException {
    public JobNotFoundException(String id) {
        super("Could not find job " + id);
    }
}
