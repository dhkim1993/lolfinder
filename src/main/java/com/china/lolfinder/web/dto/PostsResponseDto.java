package com.china.lolfinder.web.dto;

import com.china.lolfinder.domain.posts.Posts;
import lombok.Getter;

/**
 * Created by kimdonghyun on 10/12/2019.
 */

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();

    }
}
