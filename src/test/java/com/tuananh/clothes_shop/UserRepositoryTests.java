package com.tuananh.clothes_shop;

import com.tuananh.clothes_shop.model.Users;
import com.tuananh.clothes_shop.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repo;

    @Test
    public void testCreateUser() {
        Users user = new Users();
        user.setLoginId("tuananh....");
        user.setPassword("123456");

        Users savedUser = repo.save(user);

        Users existUser = entityManager.find(Users.class, savedUser.getLoginId());

        assertThat(user.getLoginId()).isEqualTo(existUser.getLoginId());

    }
}