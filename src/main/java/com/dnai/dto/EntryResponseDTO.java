package com.dnai.dtos;

import java.time.LocalDateTime;

public record EntryResponseDTO(
    Long id,
    String title,
    String body,
    String tags,
    LocalDateTime creationDate
) {}