package com.gysoft.springboothello.com.gysoft.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/5/28 13:59
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("用户名")
    @NotEmpty(message = "用户姓名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    @ApiModelProperty("密码")
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
