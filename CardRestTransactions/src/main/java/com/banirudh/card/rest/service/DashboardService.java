package com.banirudh.card.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banirudh.card.rest.component.Dashboard;
import com.banirudh.card.rest.repository.DashboardDao;

@Service
public class DashboardService {
	
	@Autowired
	private DashboardDao dashboardDao;
	
	@Transactional
	public Dashboard getDashboardCounts(){
		return dashboardDao.getDashboardCounts();
	}
}
