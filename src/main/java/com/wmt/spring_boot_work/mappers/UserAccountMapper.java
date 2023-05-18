package com.wmt.spring_boot_work.mappers;

import com.wmt.spring_boot_work.entity.UserAccount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/5/1811:47
 */
@Mapper
@Repository
public interface UserAccountMapper {
    //根据uid查询
    UserAccount queryUserAcountByuid(String uid);
}
