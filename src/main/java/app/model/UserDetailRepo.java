package app.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface UserDetailRepo extends CrudRepository<UserDetail,Integer> {
    UserDetail getByPesel(String pesel);
}
