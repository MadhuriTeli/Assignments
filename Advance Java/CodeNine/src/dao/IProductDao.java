package dao;

import java.util.List;

import pojo.Product;

public interface IProductDao {
	Product addProduct(Product p,List<Product> list);
}
