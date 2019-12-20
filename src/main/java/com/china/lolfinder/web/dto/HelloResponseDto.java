package com.china.lolfinder.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by kimdonghyun on 09/12/2019.
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
