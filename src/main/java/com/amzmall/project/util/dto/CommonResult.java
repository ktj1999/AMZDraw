package com.amzmall.project.util.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResult {
    private boolean success;
    private int code;
    private String message;
}
