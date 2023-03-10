package com.korit.karaoke.web.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CMRespDto<T> {
    @ApiModelProperty(value = "HTTP STATUS CODE", example = "200")
    private int code;
    @ApiModelProperty(value = "응답 메세지", example = "Successfully")
    private String message;
    private T data;
}
