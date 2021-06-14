package com.teammatch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "messages")
@Data
public class Message {
    @Id
    @GeneratedValue
    private Long id;

    @Lob
    @NotNull
    private String message;

    @NotNull
    private String sentDate;

    private boolean isHyperLink;

    //TODO: ManyToOne relationship
    /*@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "chat_id", nullable = false)
    @JsonIgnore
    private Chat chat;*/
}
