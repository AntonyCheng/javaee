package top.sharehome.javaee.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.sharehome.javaee.bean.Student;
import top.sharehome.javaee.bean.StudentExample;
import top.sharehome.javaee.mapper.StudentMapper;
import top.sharehome.javaee.service.api.StudentService;

import java.util.List;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/5 15:28
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageInfo<Student> queryStudentByAll(Integer pageNo) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentIdIsNotNull();
        int pageSize = 20;
        PageHelper.startPage(pageNo, pageSize);
        List<Student> studentList = studentMapper.selectByExample(studentExample);
        return new PageInfo<Student>(studentList);
    }

    @Override
    public boolean checkDuplicate(Student student) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentIdEqualTo(student.getStudentId());
        return studentMapper.selectByExample(studentExample).size() == 0;
    }

    @Override
    public void deleteStudentAll(String studentId) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentIdEqualTo(studentId);
        studentMapper.deleteByExample(studentExample);
    }

    @Override
    public void updateStudentAll(Student student) {
        studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public void insertStudent(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public PageInfo<Student> fuzzyQueryById(String studentId, Integer pageNo) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentIdLike(studentId);
        int pageSize = 20;
        PageHelper.startPage(pageNo, pageSize);
        List<Student> studentList = studentMapper.selectByExample(studentExample);
        return new PageInfo<Student>(studentList);
    }

    @Override
    public PageInfo<Student> fuzzyQueryByName(String studentName, Integer pageNo) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentNameLike(studentName);
        int pageSize = 20;
        PageHelper.startPage(pageNo, pageSize);
        List<Student> studentList = studentMapper.selectByExample(studentExample);
        return new PageInfo<Student>(studentList);
    }

    @Override
    public PageInfo<Student> fuzzyQueryByMajor(String studentMajor, Integer pageNo) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentMajorLike(studentMajor);
        int pageSize = 20;
        PageHelper.startPage(pageNo, pageSize);
        List<Student> studentList = studentMapper.selectByExample(studentExample);
        return new PageInfo<Student>(studentList);
    }

    @Override
    public PageInfo<Student> fuzzyQueryByCollege(String studentCollege, Integer pageNo) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentCollegeLike(studentCollege);
        int pageSize = 20;
        PageHelper.startPage(pageNo, pageSize);
        List<Student> studentList = studentMapper.selectByExample(studentExample);
        return new PageInfo<Student>(studentList);
    }

}
