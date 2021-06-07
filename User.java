package fixme;

import javax.persistence.Column;
import lombok.Data;

@Data
public class User {
  @Column(name = "Login_id", nullable = false)
  String loginId;
  @Column(name = "Password")
  String password;
}
