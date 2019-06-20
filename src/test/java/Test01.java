import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.mapper.UserMapper;
import ssm.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml"})

public class Test01 {
    @Autowired
    private UserMapper userMapper;

    @Test
public void tt(){

        User user = userMapper.findbyID(1L);
        System.out.println(user);

    }
}
