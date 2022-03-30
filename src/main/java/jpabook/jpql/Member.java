package jpabook.jpql;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Member")
public class Member {
    @Column(name = "name")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
