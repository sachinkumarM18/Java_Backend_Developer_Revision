package com.productManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.productManagement.model.Product;

@Controller
public class ProductController {
	@GetMapping("products")
	@ResponseBody
	public String displayAllProducts() {
		return "All Product Available";
	}

	@GetMapping("product/{id}")
	@ResponseBody
	public String displayProduct(@PathVariable("id") int id) {
		return "Product ID: " + id;
	}

	@GetMapping("products/search")
	@ResponseBody
	public String searchProducts(@RequestParam("category") String category) {
		return "Searching products in category: " + category;
	}

	@GetMapping("products/filter")
	@ResponseBody
	public String filterProducts(@RequestParam("category") String category, @RequestParam("brand") String brand) {

		return "Category: " + category + ", Brand: " + brand;
	}

	@PostMapping("addProduct")
	@ResponseBody
	public String addProduct(@ModelAttribute Product product) {

		return "Product Added Successfully!\n" + "Name: " + product.getProductName() + "\n" + "Price: "
				+ product.getPrice() + "\n" + "Category: " + product.getCategory() + "\n" + "Quantity: "
				+ product.getQuantity();
	}

}
