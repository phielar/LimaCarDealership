/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.Model;

import java.util.Objects;

/**
 *
 * @author phila
 */
public final class Job {

    private String jobid;
    private String jobDescription;
    private double basicSalary;

    private Job() {
    }

    public Job(Builder build) {
        this.jobid = build.jobid;
        this.jobDescription = build.jobDescription;
        this.basicSalary = build.basicSalary;
    }

    public static class Builder {

        private String jobid;
        private String jobDescription;
        private double basicSalary;

        public Builder(String jobid) {
            this.jobid = jobid;
        }

        public Builder jobid(String value) {
            jobid = value;
            return this;
        }

        public Builder jobDescription(String value) {
            jobDescription = value;
            return this;
        }

        public Builder basicSalary(double value) {
            basicSalary = value;
            return this;
        }

        public Job build() {
            return new Job(this);
        }
    }

    public String getJobid() {
        return jobid;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.jobid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Job other = (Job) obj;
        if (!Objects.equals(this.jobid, other.jobid)) {
            return false;
        }
        return true;
    }
}
