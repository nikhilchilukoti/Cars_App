package com.cars.OrderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cars.OrderService.model.OrderServiceEntity;
import com.cars.OrderService.repository.OrderServiceRepository;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.cars.OrderService.model.ColorModel;
import com.cars.OrderService.model.AccessoryModel;
@Service
@Transactional
public class OrderService {
	
	@Autowired
	OrderServiceRepository orderServiceRepository;
	
	
	public boolean saveOrder(SaveDTO savedto) {
		try {
			List<AccessoryModel> accessoryModel=new ArrayList<>();
			List<ColorModel> colorModel=new ArrayList<>();
			
			OrderServiceEntity order =new OrderServiceEntity(savedto.getSeriesId(),savedto.getModelId(),savedto.getPrice());
			savedto.getAccessoriesSelect().forEach(accessory->{
				AccessoryModel accessoryObject =new AccessoryModel(accessory.
						getAccessories_id(),
						accessory.getAccessories_name());
				accessoryModel.add(accessoryObject);
			});
			
			savedto.getColorsSelect().forEach(color->{
				ColorModel colorObj=new ColorModel(color.getColors_id(),color.getColors_name());
				colorModel.add(colorObj);
			});
			order.setColorModel(colorModel);
			order.setAccessoryModel(accessoryModel);
			orderServiceRepository.save(order);
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	
}
