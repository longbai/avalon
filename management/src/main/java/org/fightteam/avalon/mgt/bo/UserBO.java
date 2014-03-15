package org.fightteam.avalon.mgt.bo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.fightteam.avalon.mgt.bo.link.UserLinks;
import org.fightteam.avalon.mgt.rest.BasicRestEntity;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class UserBO {
    private String username;
    private String password;
    private String email;
    private String name;
    @JsonProperty(value = "_links")
    private UserLinks userLinks;
    @Override
    public String toString() {
        return "UserBO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
