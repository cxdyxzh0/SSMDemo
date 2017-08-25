package com.yztc.yxc.service;


import com.yztc.yxc.entity.product.Product;

import java.util.List;

public interface ProductService {
    /**
     * TODO 添加商品
     * @param product
     */
    public void addProduct(Product product);

    /**
     * TODO 删除商品
     * @param pid
     */
    public void deleteProduct(int pid);

    /**
     * TODO 查找全部商品
     * @return
     */
    public List<Product>  findAll();
}
