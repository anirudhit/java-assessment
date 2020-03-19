package com.banirudh.card.rest.repository;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.banirudh.card.rest.component.Dashboard;

@Repository
public class DashboardDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private Dashboard dashboardCounts;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	// Get dashboard count
	public Dashboard getDashboardCounts() {
		
//		Session session = getSessionFactory().getCurrentSession();
//		SQLQuery sQuery = session.createSQLQuery("SELECT (SELECT COUNT(*) FROM User u) as usercount, (SELECT COUNT(*) FROM Account a) as accountcount");
//		List<List> list = sQuery.getResultList();
//		return list;
		
		Session session = getSessionFactory().getCurrentSession();
		
		String hql_account = "SELECT count(*) AS accountcount FROM Account a";
		Query query_account = session.createQuery(hql_account);
		List count_account = query_account.list();
		dashboardCounts.setAccountCount(Integer.parseInt(count_account.get(0).toString()));
		
		String hql_user = "SELECT count(*) AS usercount FROM User U";
		Query query_user = session.createQuery(hql_user);
		List count_user = query_user.list();
		dashboardCounts.setUserCount(Integer.parseInt(count_user.get(0).toString()));
		
		return dashboardCounts;
		
	}
}