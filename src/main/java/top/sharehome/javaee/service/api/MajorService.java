package top.sharehome.javaee.service.api;

import top.sharehome.javaee.bean.Major;

import java.util.List;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/5 15:27
 */

public interface MajorService {
    List<Major> initMajor(String studentCollege);

    boolean checkMajorDuplicate(Major major);

    void addMajor(Major major);
}
