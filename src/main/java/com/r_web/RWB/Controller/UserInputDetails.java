package com.r_web.RWB.Controller;

import java.util.List;

public class UserInputDetails {
    private String name;



    private String email;
    private String phone;
    private String summary;
    private List<Education> educationList;
    private List<WorkExperience> workExperienceList;
    private List<String> skillsList;
    private List<String> achievementsList;

    // Getters and setters
    //...

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSummary() {
        return summary;
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public List<WorkExperience> getWorkExperienceList() {
        return workExperienceList;
    }

    public List<String> getSkillsList() {
        return skillsList;
    }

    public List<String> getAchievementsList() {
        return achievementsList;
    }

    // setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public void setWorkExperienceList(List<WorkExperience> workExperienceList) {
        this.workExperienceList = workExperienceList;
    }

    public void setSkillsList(List<String> skillsList) {
        this.skillsList = skillsList;
    }

    public void setAchievementsList(List<String> achievementsList) {
        this.achievementsList = achievementsList;
    }
}