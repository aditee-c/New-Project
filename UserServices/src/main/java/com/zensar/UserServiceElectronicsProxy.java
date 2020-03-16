package com.zensar;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.entities.UserElectronicEntity;


@FeignClient(name = "electronic-service")
@RibbonClient(name = "electronic-service")
public interface UserServiceElectronicsProxy {
		
		@RequestMapping("/productByUid/{id}")
		public List<UserElectronicEntity> ProductByuserId(@PathVariable("id") int productid);
		
	

}
