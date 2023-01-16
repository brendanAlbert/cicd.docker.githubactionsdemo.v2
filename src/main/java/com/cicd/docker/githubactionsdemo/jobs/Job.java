package com.cicd.docker.githubactionsdemo.jobs;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;

import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

@Container(containerName = "Jobs")
public class Job {
    private @Id @GeneratedValue String id;
    private String datePosted;
    private String title;
    private String company;
    private String location;
    private String jobSite;
    private String remoteHybridOnsite;
    private String pay;
    private String[] skills;
    private String[] experience;

    public Job() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) { this.company = company; }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRemoteHybridOnsite() {
        return remoteHybridOnsite;
    }

    public void setRemoteHybridOnsite(String remoteHybridOnsite) {
        this.remoteHybridOnsite = remoteHybridOnsite;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String[] getExperience() {
        return experience;
    }

    public void setExperience(String[] experience) {
        this.experience = experience;
    }

    public String getDatePosted() { return datePosted; }

    public void setDatePosted(String datePosted) { this.datePosted = datePosted; }

    public String getJobSite() {
        return jobSite;
    }

    public void setJobSite(String jobSite) {
        this.jobSite = jobSite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(id, job.id) && Objects.equals(datePosted, job.datePosted)
                && Objects.equals(title, job.title)
                && Objects.equals(company, job.company)
                && Objects.equals(location, job.location)
                && Objects.equals(jobSite, job.jobSite)
                && Objects.equals(remoteHybridOnsite, job.remoteHybridOnsite)
                && Objects.equals(pay, job.pay)
                && Arrays.equals(skills, job.skills)
                && Arrays.equals(experience, job.experience);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, datePosted, title, company, location, jobSite, remoteHybridOnsite, pay);
        result = 31 * result + Arrays.hashCode(skills);
        result = 31 * result + Arrays.hashCode(experience);
        return result;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id='" + id + '\'' +
                ", datePosted='" + datePosted + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", jobSite='" + jobSite + '\'' +
                ", remoteHybridOnsite='" + remoteHybridOnsite + '\'' +
                ", pay='" + pay + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", experience=" + Arrays.toString(experience) +
                '}';
    }
}
