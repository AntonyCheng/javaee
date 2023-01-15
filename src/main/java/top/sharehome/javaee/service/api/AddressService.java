package top.sharehome.javaee.service.api;

import top.sharehome.javaee.bean.Address;

import java.util.List;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/5 15:27
 */

public interface AddressService {
    List<Address> initAddress(String studentProvince);

    boolean checkAddressDuplicate(Address address);

    void addAddress(Address address);
}
