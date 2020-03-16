package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.CartDao;
@Service
@Transactional
public class CartServiceImpl implements CartServices {

	@Autowired
	private CartDao cartdao;
	
	

}
