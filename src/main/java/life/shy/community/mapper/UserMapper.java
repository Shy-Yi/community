package life.shy.community.mapper;

import life.shy.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO User (account_id, name, token, gmt_create, gmt_modified) VALUES (#{account_id}, #{name},#{token}, #{gmt_create}, #{gmt_modified})")
    void insert(User user);

    @Select("SELECT * FROM User WHERE token = #{token}")
    User findBytoken(@Param("token") String token);
}
