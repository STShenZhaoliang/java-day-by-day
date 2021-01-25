package login.test;

import login.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;

/**
 * @description:
 * @author: st
 * @create: 2021-01-25 14:28
 **/

public class BeanUtilsTest {
    @Test
    public void test(){

        User user = new User();
        try {
            BeanUtils.setProperty(user,"username","st123");
            System.out.println(user);

            String username = BeanUtils.getProperty(user, "username");
            System.out.println(username);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
