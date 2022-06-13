package com.rk.rundata;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.model.Model;
import com.rk.model.Product;
import com.rk.repo.ModelRepository;
import com.rk.repo.ProductRepositroy;

@Component
public class OneToManyRunner  implements CommandLineRunner{
	@Autowired
	private ModelRepository mrepo;
	@Autowired
	private ProductRepositroy prepo;
	@Override
	public void run(String... args) throws Exception {
		Model m=new Model(105, "M34", "RED", 5200.00);
		Model m1=new Model(106, "K45", "BLUE", 5400.00);
		Model m2=new Model(107, "YT9", "PINK", 5200.00);
		mrepo.save(m);
		mrepo.save(m1);
		mrepo.save(m2);
		
		Product p = new Product(10, "S-Mobile", "chandan", Arrays.asList(m,m1,m2));
		prepo.save(p);
		
	}

}
