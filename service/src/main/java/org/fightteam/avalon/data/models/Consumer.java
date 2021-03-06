package org.fightteam.avalon.data.models;

import lombok.Getter;
import lombok.Setter;
import org.fightteam.avalon.security.data.models.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * portal用户
 *
 * @author faith
 * @since 0.0.1
 */
@Entity
@Getter
@Setter
public class Consumer extends User {

    private String name;
    private String nickname;
    private String motto;
    private String mottoBy;

    @ManyToMany
    private List<Book> books = new ArrayList<>();

    @OneToMany(mappedBy = "sender")
    private List<Message> sendMessages = new ArrayList<>();

    @ManyToMany(mappedBy = "recipients")
    private List<Message> receiveMessages = new ArrayList<>();
}
