package com.yztc.yxc.service;

import com.yztc.yxc.entity.page.Page;
import com.yztc.yxc.entity.product.Product;

public interface PageService {

    public Page<Product> findAllUserWithPage(int pageNum, int pageSize);
}
