package com.cicd.docker.githubactionsdemo.jobs;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;

public interface JobRepository extends ReactiveCosmosRepository<Job, String> {}
