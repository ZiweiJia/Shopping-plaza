package com.shopping.demo.service;

import com.shopping.demo.mbg.model.PmsBrand;

import java.util.List;


public interface PmsBrandService {
    List<PmsBrand> listAllBrand();
    int createBrand(PmsBrand brand);
    int updateBrand(Long id, PmsBrand brand);
    int deleteBrand(Long id);
    List<PmsBrand> listBrand(int pageNum, int pageSize);
    PmsBrand getBrand(Long id);
}
