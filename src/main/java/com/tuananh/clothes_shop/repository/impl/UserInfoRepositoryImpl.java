package com.tuananh.clothes_shop.repository.impl;

import com.tuananh.clothes_shop.repository.UserInfoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

@Repository
@Transactional(readOnly = true)
public class UserInfoRepositoryImpl implements UserInfoRepository {
    @PersistenceContext
    EntityManager entityManager;
}
