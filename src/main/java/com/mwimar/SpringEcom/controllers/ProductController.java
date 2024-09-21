package com.mwimar.SpringEcom.controllers;

@RestController("api")
public class ProductController {
    @RequestMapping("/products")
    public String getAllProducts(){
        return "AllProducts";
    }
}
