package com.zensar;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.entities.UserClothEntity;
import com.zensar.entities.UserElectronicEntity;

@FeignClient(name = "cloth-service")
@RibbonClient(name = "cloth-service")
public interface UserServiceProxy {
	@RequestMapping("/clothByUid/{id}")
	public List<UserClothEntity> ClothByuserId(@PathVariable("id") int userid);
	
	@RequestMapping("/productByUid/{id}")
	public List<UserElectronicEntity> ProductByuserId(@PathVariable("id") int productid);
	
}
