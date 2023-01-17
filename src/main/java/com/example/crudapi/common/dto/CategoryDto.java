package com.example.crudapi.common.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Short id;
    @NotEmpty(message = "the name is required") @Size(max = 50, message = "the length of the name must be between 1 and 50 characters.")
    private String name;
}
