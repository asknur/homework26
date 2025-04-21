package models;

public class Cast {
    private String fullName;
    private String role;

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        String fmt = "Актер: %s в роли: %s %n";
        return String.format(fmt, getFullname(), getRole());
    }
}
