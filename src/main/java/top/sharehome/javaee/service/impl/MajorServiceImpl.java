package top.sharehome.javaee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.sharehome.javaee.bean.Major;
import top.sharehome.javaee.bean.MajorExample;
import top.sharehome.javaee.mapper.MajorMapper;
import top.sharehome.javaee.service.api.MajorService;

import java.util.List;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/5 15:28
 */
@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    private MajorMapper majorMapper;

    @Override
    public List<Major> initMajor(String studentCollege) {
        MajorExample majorExample = new MajorExample();
        MajorExample.Criteria criteria = majorExample.createCriteria();
        criteria.andMajorCollegeEqualTo(studentCollege);
        return majorMapper.selectByExample(majorExample);
    }

    @Override
    public boolean checkMajorDuplicate(Major major) {
        MajorExample majorExample = new MajorExample();
        MajorExample.Criteria criteria = majorExample.createCriteria();
        criteria.andMajorCollegeEqualTo(major.getMajorCollege()).andMajorNameEqualTo(major.getMajorName());
        return majorMapper.selectByExample(majorExample).size() == 0;
    }

    @Override
    public void addMajor(Major major) {
        majorMapper.insert(major);
    }
}
