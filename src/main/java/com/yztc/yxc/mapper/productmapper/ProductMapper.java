package com.yztc.yxc.mapper.productmapper;


import com.yztc.yxc.entity.product.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductMapper {
    /**
     * TODO 添加新商品
     * @param product
     */
    public void addProduct(Product product);


    /**
     * TODO 删除商品
     * @param pid
     *
     */
    public void deleteProduct(int pid);


    /**
     * TODO 查询全部产品
     * @return
     */
    public List<Product> findAll();
}
