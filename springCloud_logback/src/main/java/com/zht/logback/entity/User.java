package com.zht.logback.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String id;
    private String username;
    private String sex;
    private String memo;
}
