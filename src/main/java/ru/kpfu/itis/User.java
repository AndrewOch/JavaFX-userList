package ru.kpfu.itis;

public class User {

    private String name;
    private String group;
    private String graduationYear;
    private String university;

    public User() {
    }

    public User(String name, String group, String graduationYear, String university) {
        this.name = name;
        this.group = group;
        this.graduationYear = graduationYear;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return name + ", Группа: " + group + ", Год окончания школы: " + graduationYear + ", Университет: " + university;
    }
}
