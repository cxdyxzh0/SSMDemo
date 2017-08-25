package com.yztc.yxc.controller.productcontroller;

import com.yztc.yxc.entity.product.Product;
import com.yztc.yxc.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public String addProduct(Product product){
        productService.addProduct(product);
        return "tips";
    }

    @RequestMapping(value = "/delete.do",method = RequestMethod.GET)
    public String deleteProduct(int pid){
        productService.deleteProduct(pid);
        return "tips";
    }


    public String findAll(Model model){

        List<Product> products = productService.findAll();

        return "";
    }
}
