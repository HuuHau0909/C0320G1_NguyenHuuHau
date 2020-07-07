package hau.example.test_province.servince;

import hau.example.test_province.entities.Province;

import java.util.List;

public interface ProvinceServince {
    List<Province> getAllProvince();

    void saveProvince(Province province);
}
