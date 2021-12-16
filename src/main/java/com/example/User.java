package com.example;

public class User {

    private UserId userId;
    private String userName;

    public User(UserId userId, String name) {
        NullValidator.checkNull(userId);
        this.userId = userId;

        NullValidator.checkNull(name);
        this.userName = name;
    }

    public void changeUserName(String name) {
        userName = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof UserId)) {
            return false;
        }

        if (userId.equals(obj)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + "]";
    }

}
