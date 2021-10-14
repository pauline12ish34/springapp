package com.ac.play.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="marks")
public class Mark {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private int max;

    @NotNull
    private int scored;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getScored() {
        return scored;
    }

    public void setScored(int scored) {
        this.scored = scored;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
