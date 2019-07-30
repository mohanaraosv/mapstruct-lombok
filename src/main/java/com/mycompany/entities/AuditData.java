package com.mycompany.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AuditData {

    private String        createdBy;

    private LocalDateTime createdLocalDateTime;

    private LocalDate     createdLocalDate;

    private String        modifiedBy;

    private LocalDateTime modifiedLocalDateTime;

    private LocalDate     modifiedLocalDate;
}
