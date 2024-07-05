package com.r_web.RWB.Service;

import com.r_web.RWB.Entity.Resume;

import java.util.ArrayList;
import java.util.List;

public class ResumeService {
    private List<Resume> resumes;

    public ResumeService() {
        this.resumes = new ArrayList<>();
    }

    public void createResume(Resume resume) {
        resumes.add(resume);
    }

    public Resume getResume(int id) {
        for (Resume resume : resumes) {
            if (resume.getId() == id) {
                return resume;
            }
        }
        return null;
    }

    public void updateResume(Resume resume) {
        for (int i = 0; i < resumes.size(); i++) {
            if (resumes.get(i).getId() == resume.getId()) {
                resumes.set(i, resume);
                return;
            }
        }
    }

    public void deleteResume(int id) {
        resumes.removeIf(resume -> resume.getId() == id);
    }

    public List<Resume> getAllResumes() {
        return resumes;
    }
}
