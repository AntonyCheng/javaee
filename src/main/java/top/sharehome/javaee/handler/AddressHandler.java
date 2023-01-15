package top.sharehome.javaee.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.sharehome.javaee.bean.Address;
import top.sharehome.javaee.bean.Major;
import top.sharehome.javaee.service.api.AddressService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/5 15:29
 */
@Controller
public class AddressHandler {
    @Autowired
    private AddressService addressService;

    @GetMapping("/init/address")
    @ResponseBody
    public List<String> initAddress(@RequestParam("studentProvince") String studentProvince) {
        List<Address> addressList = addressService.initAddress(studentProvince);
        List<String> addresses = new ArrayList<String>();
        addressList.forEach(address -> {
            addresses.add(address.getAddressCity());
        });
        return addresses;
    }

    @GetMapping("/to/add/address/page")
    public String toAddAddressPage() {
        return "addAddress/addAddress";
    }

    @PostMapping("/add/address")
    public String addAddress(Address address, Model model) {
        if (addressService.checkAddressDuplicate(address)){
            addressService.addAddress(address);
            model.addAttribute("addAddressResult", "存入成功！");
            return "addAddress/addAddress";
        }
        model.addAttribute("addAddressResult", "该省份这个地级市已经存在！");
        return "addAddress/addAddress";
    }
}
