package com.ha.test;

import org.hibernate.Transaction;
import org.hibernate.Session;

import com.ha.entities.Task;
import com.ha.util.HibernateSessionFactory;

public class HATest {
	public static void main(String[] args) {
		boolean flag = false;
		Task task = null;
		Session session = null;
		Transaction transaction = null;

		try {
			/*task = new Task();
			task.setTaskID(24);
			task.setTitle("Hibernate Entity Mappings");
			task.setDescription("Using annotations in mapping entity classes");
			task.setEstimatedHours(1);
			task.setStatus("pending");
			task.setAssigned("worest fellows");*/

			session = HibernateSessionFactory.getSessionFactory().openSession();
			/*transaction = session.beginTransaction();
			session.save(task);*/
			task = (Task) session.get(Task.class, 24);
			System.out.println(task);
			flag = true;
		} finally {
			if (session != null) {
				/*if (flag == true) {
					transaction.commit();
				} else {
					transaction.rollback();
				}*/
				session.close();
			}
		}
		HibernateSessionFactory.closeSessionFactory();
	}
}
