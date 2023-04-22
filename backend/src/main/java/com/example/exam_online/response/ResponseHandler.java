package com.example.exam_online.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseHandler<T> {
    private String message;
    private int status;
    private T data;
}
