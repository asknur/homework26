package models;

public class Director {
    private String fullName;

    public Director(String fullName) {
        this.fullName = fullName;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
