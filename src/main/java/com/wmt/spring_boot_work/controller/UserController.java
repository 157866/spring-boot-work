package com.wmt.spring_boot_work.controller;

import com.wmt.spring_boot_work.entity.UserAccount;
import com.wmt.spring_boot_work.mappers.UserAccountMapper;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/5/1811:19
 */
@Slf4j/*日志*/
@RestController/*@ResponseBody和@Controller的合并*/
@RequestMapping("/user")/*网页总地址*/
public class UserController {
    @Resource
    private UserAccountMapper userAccountMapper;
    /*get请求就用@GetMapping  post请求就使用@PostMapping*/
    @GetMapping("/insert")
    public UserAccount hello(){
        return userAccountMapper.queryUserAcountByuid("1");
    }
}