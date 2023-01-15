package top.sharehome.javaee.service.api;

import com.github.pagehelper.PageInfo;
import top.sharehome.javaee.bean.Student;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/5 15:27
 */

public interface StudentService {

    PageInfo<Student> queryStudentByAll(Integer pageNo);

    boolean checkDuplicate(Student student);

    void deleteStudentAll(String studentId);

    void updateStudentAll(Student student);

    void insertStudent(Student student);

    PageInfo<Student> fuzzyQueryById(String studentId, Integer pageNo);

    PageInfo<Student> fuzzyQueryByName(String studentName, Integer pageNo);

    PageInfo<Student> fuzzyQueryByMajor(String studentMajor, Integer pageNo);

    PageInfo<Student> fuzzyQueryByCollege(String studentCollege, Integer pageNo);
}
