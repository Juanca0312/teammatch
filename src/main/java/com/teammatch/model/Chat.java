package com.teammatch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "chats")
@Data
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@ManyToMany(fetch = FetchType.LAZY,
    //        cascade = {CascadeType.PERSIST, CascadeType.MERGE},
    //        mappedBy = "chats")
    //@JsonIgnore
    //private List<Player> players;

}
