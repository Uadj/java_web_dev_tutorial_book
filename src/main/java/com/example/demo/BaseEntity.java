package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
public class BaseEntity {

    @Column(name = "regdate", updatable = false)
    @CreatedDate
    private LocalDateTime regDate;

    @Column(name = "moddate")
    @LastModifiedDate
    private LocalDateTime modDate;
}
