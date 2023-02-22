package com.korit.karaoke.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserMst {

    private int userId;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String repassword;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private List<RoleDtl> roleDtl;

}
