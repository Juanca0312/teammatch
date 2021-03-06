package com.teammatch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "profiles")
@Getter
@Setter

public class Profile {

    @Id
    private Long id;

    @NotBlank
    @NotNull
    @Size(max = 20)
    @Column(name = "full_names")
    private String fullName;

    @NotBlank
    @NotNull
    @Size(max = 20)
    private String username;

    @NotBlank
    @NotNull
    @Size(max = 50)
    private String description;

    @NotBlank
    @NotNull
    @Size(max = 20)
    private String gender;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private String email;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private String phoneNumber;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private Date birthDate;

    @OneToOne(mappedBy = "profile")
    @JsonIgnore
    private Player player;

    public Profile setId(Long id) {
        this.id = id;
        return this;
    }

}
