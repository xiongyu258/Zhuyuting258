package ssm.mapper;

import org.apache.ibatis.annotations.Param;
import ssm.pojo.User;

public interface UserMapper {
  public User findbyID(@Param("id") Long id);
}
