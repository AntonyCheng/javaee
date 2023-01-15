package top.sharehome.javaee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.sharehome.javaee.bean.Address;
import top.sharehome.javaee.bean.AddressExample;
import top.sharehome.javaee.mapper.AddressMapper;
import top.sharehome.javaee.service.api.AddressService;

import java.util.List;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/5 15:28
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> initAddress(String studentProvince) {
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andAddressProviceEqualTo(studentProvince);
        return addressMapper.selectByExample(addressExample);
    }

    @Override
    public boolean checkAddressDuplicate(Address address) {
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andAddressProviceEqualTo(address.getAddressProvice()).andAddressCityEqualTo(address.getAddressCity());
        return addressMapper.selectByExample(addressExample).size() == 0;
    }

    @Override
    public void addAddress(Address address) {
        addressMapper.insert(address);
    }
}
