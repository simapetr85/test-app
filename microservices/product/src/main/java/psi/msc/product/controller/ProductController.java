package psi.msc.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import psi.msc.product.dto.Product;

import java.util.Random;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    Environment env;

    @Value("${name}")
    private String nameFromProperties;

    @Value("#{environment.monster}")
    private String descriptionFromSystemProperties;

    @GetMapping("/{id}")
    public Product get(@PathVariable String id) {



        Product product = new Product();
        product.setId(id);
        product.setName(nameFromProperties);
        product.setDescription(descriptionFromSystemProperties);
        product.setQuantity(new Random().nextInt());
        return product;
    }
}

