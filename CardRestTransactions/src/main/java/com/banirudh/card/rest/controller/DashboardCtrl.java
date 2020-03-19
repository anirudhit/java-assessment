package com.banirudh.card.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banirudh.card.rest.component.Dashboard;
import com.banirudh.card.rest.service.DashboardService;



@RestController
public class DashboardCtrl {
	@Autowired
	private DashboardService dashboardService;
	
	@RequestMapping(value="/getDashboardCounts", method=RequestMethod.GET, headers="Accept=application/json")
    public Dashboard getDashboardCounts() {
        Dashboard dashboardCount = dashboardService.getDashboardCounts();
        return dashboardCount;
    }
}
