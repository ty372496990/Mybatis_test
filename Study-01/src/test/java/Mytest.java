import com.ty.dao.TeacherMapper;
import com.ty.pojo.Teacher;
import com.ty.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {
    @Test
    public void test(){
        SqlSession sqlsession = MyBatisUtils.getSqlsession();
        TeacherMapper mapper = sqlsession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlsession.close();
    }
}
