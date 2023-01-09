package com.cicd.docker.githubactionsdemo.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/v1/jobs")
public class JobController {
    @Autowired
    private final JobRepository repository;
    private final JobModelAssembler assembler;

    public JobController(JobRepository repository, JobModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @GetMapping("/{id}")
    EntityModel<Job> getJob(@PathVariable String id) {
        Job job = repository.findById(id).block();
        if (job != null) {
            return assembler.toModel(job);
        }
        return null;
    }

    @GetMapping
    CollectionModel<EntityModel<Job>> getAll() {
        List<EntityModel<Job>> jobs = repository.findAll().toStream()
                .map(assembler::toModel)
                .collect(Collectors.toList());
        return CollectionModel.of(jobs,
                linkTo(methodOn(JobController.class).getAll()).withSelfRel());
    }

    @PostMapping
    Mono<Job> addJob(@RequestBody Job job) {
        return repository.save(job);
    }
}
