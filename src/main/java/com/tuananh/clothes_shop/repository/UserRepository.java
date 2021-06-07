package com.tuananh.clothes_shop.repository;

import com.tuananh.clothes_shop.dto.UserInfoDto;
import com.tuananh.clothes_shop.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, String>, UserInfoRepository {
    @Query("SELECT new com.tuananh.clothes_shop.dto.UserInfoDto(U.loginId, A.id, S.ID, C.phone) " +
            "FROM ShoppingCart S INNER JOIN Account A on A.id = S.accountId\n" +
            "INNER JOIN Customer C on C.id = A.customerId\n" +
            "INNER JOIN Users U on U.loginId = C.userloginId\n" +
            "WHERE C.userloginId = ?1")
    List<UserInfoDto> getUserInfo(String loginId);
}