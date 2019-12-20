package com.china.lolfinder.config.auth.dto;

import com.china.lolfinder.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by kimdonghyun on 12/12/2019.
 */

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
