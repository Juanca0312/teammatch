package com.teammatch.resource;

import lombok.Data;

@Data
public class MessageResource {
    private Long id;
    private String message;
    private String sentDate;
    private boolean isHyperLink;

}
