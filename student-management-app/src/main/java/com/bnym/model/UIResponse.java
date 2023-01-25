package com.bnym.model;

import com.bnym.annotations.GenerateTypeScript;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@GenerateTypeScript
public class UIResponse<T> {
    private T data;
    private int count;

    private String errorMessage;
}
