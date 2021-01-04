package WebScrap.controller;
import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import WebScrap.utils.*;


public class amazonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	
    public amazonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
	/*	System.out.println(" View Controller Init Method Called");
		try {
			con = DbConnection.getConnection();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	*/}

	public void destroy() {
	/*	System.out.println("View Controller Destroy Method Called");
		try {
			DbConnection.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();

			System.out.println("Catch");
		}
*/	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String link2= request.getParameter("link");
		String product1= request.getParameter("product");
		final Document document= Jsoup.connect(link2).get();
		//https://www.amazon.in/dp/B081JWZQJB/ref=fs_a_mn_3
		
		HashMap<String , String> hm = new HashMap<String,String>();
		Elements element= document.select("#priceblock_ourprice");
		
		String text = element.text();
       element = document.select("#productTitle");
       String name = element.text();
		System.out.println(name+" "+text);
		hm.put(name, text);
		request.setAttribute("hashMap",hm);
		request.getRequestDispatcher("amazonProduct.jsp").forward(request,response);
		
			}

}