package com.yztc.yxc.service.impl;


import com.yztc.yxc.entity.product.Product;
import com.yztc.yxc.mapper.productmapper.ProductMapper;
import com.yztc.yxc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("/productSerivce")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;




    public void addProduct(Product product) {
            productMapper.addProduct(product);
    }

    public void deleteProduct(int pid) {
        productMapper.deleteProduct(pid);
    }

    public List<Product> findAll() {

        return productMapper.findAll();
    }
}
