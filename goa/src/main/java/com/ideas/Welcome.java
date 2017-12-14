package com.ideas;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.google.gson.Gson;

import goa.Employe;
import goa.Employee;
import goa.EmployeeRepository;
import goa.HibernateUtils;
import junit.framework.Assert;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			int empId = Integer.parseInt(request.getParameter("empId"));
			
			
			
			SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Employe employee = session.find(Employe.class,empId);
			Gson gson = new Gson();
			session.getTransaction().commit();
			response.getWriter().append(gson.toJson(employee));
			
			
			
			
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employe employee = new Employe();
		employee.setName(request.getParameter("name"));
		employee.setConatactNumber(Integer.parseInt(request.getParameter("contact")));
		employee.setDepartment(request.getParameter("dept"));
		employee.setGender(request.getParameter("gender"));
		employee.setSelf(Boolean.parseBoolean((request.getParameter("self"))));
		employee.setCompanyEmployeeId(Integer.parseInt(request.getParameter("companyId")));
		session.save(employee);
		session.getTransaction().commit();
		response.sendRedirect("thank.html");
		//doGet(request, response);
	}

}
