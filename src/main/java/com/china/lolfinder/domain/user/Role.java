package com.china.lolfinder.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by kimdonghyun on 12/12/2019.
 */

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반사용자");

    private final String key;
    private final String title;
}
