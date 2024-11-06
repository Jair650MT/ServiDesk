package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Area;
import com.uisrael.servicedesk.repository.IAreaRepository;
import com.uisrael.servicedesk.service.IAreaServices;

@Service
@Component
public class AreaServicesImpl implements IAreaServices {
	@Autowired
	private IAreaRepository repoArea;
	@Override
	public void insertArea(Area nuevaArea) {
		// TODO Auto-generated method stub
		repoArea.save(nuevaArea);
	}

	@Override
	public List<Area> verAreas() {
		// TODO Auto-generated method stub
		return repoArea.findAll();
	}

	@Override
	public void borrarArea(Integer id) {
		// TODO Auto-generated method stub
		repoArea.deleteById(id);
	}

	@Override
	public Optional<Area> editarArea(Integer id) {
		// TODO Auto-generated method stub
		return repoArea.findById(id);
	}
	

}
