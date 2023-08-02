package com.studying.java;

import java.time.LocalDate;

public class SiteUser {
    private final String email;
    private final String name;
    private final LocalDate birthday;

    public SiteUser(String email, String name, LocalDate birthday) {
        this.email = email;
        this.name = name;
        this.birthday = birthday;
    }

    // TODO implement equals and hashCode by email and name (objects are equal if emails and names are equal by values and even if birthdays are different)

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

