package com.cicd.docker.githubactionsdemo.jobs;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class JobModelAssembler implements RepresentationModelAssembler<Job, EntityModel<Job>> {

    @Override
    public EntityModel<Job> toModel(Job job) {
        return EntityModel.of(job,
                linkTo(methodOn(JobController.class).getJob(job.getId())).withSelfRel(),
                linkTo(methodOn(JobController.class).getAll()).withRel("jobs"));
    }
}
