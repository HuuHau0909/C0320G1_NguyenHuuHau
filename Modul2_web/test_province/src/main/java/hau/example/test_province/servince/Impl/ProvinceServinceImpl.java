package hau.example.test_province.servince.Impl;

import hau.example.test_province.entities.Province;
import hau.example.test_province.repository.CustomerRepository;
import hau.example.test_province.repository.ProvinceRepository;
import hau.example.test_province.servince.ProvinceServince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServinceImpl  implements ProvinceServince {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> getAllProvince() {
        return provinceRepository.findAllByIsDeleteIsFalse();
    }

    @Override
    public void saveProvince(Province province) {
        provinceRepository.save(province);
    }
}
