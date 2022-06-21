package com.rick.exp6.dox;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
public class UserAndAddress {

    private Long userId;
    private Long addressId;
    private String detail;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
