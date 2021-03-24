package com.demo.services.mapservices;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.demo.domain.DomainObject;
import com.demo.domain.Product;
import com.demo.services.ProductService;

@Service
@Profile("map")
public class ProductServiceImpl extends AbstractMapService implements ProductService{
	
	@Override
	public Product getById(Integer id) {
		return (Product) super.getById(id);
	}
	
    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Product saveOrUpdate(Product product) {
    	return (Product) super.saveOrUpdate(product);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }
}
