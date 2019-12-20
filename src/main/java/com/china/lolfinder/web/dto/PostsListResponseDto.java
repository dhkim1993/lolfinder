package com.china.lolfinder.web.dto;

import com.china.lolfinder.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Created by kimdonghyun on 11/12/2019.
 */

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.content=entity.getContent();
        this.author=entity.getAuthor();
        this.modifiedDate=entity.getModifiedDate();
    }
}
