package sy.java;

import com.test.model.EmpInfo;
import com.test.service.EmpInfoService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mvc.xml", "classpath:spring-mybatis.xml" })
public class TestMyBatis {
    private static final Logger logger = Logger.getLogger(TestMyBatis.class);
    @Resource
    EmpInfoService empInfoService;

    @Test
    public void test(){
        EmpInfo empInfo=empInfoService.getEmpInfoById(1L);
        logger.info(empInfo.getName());

    }
}
