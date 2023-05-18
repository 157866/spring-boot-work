package com.wmt.spring_boot_work.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/5/1811:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Alias("userAccount")
public class UserAccount {
    private String uid;
    private String unick;
    private String uaccount;
    private String upassword;
    private int status;
}

