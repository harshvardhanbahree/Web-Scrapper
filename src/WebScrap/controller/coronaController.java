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


public class coronaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	
    public coronaController() {
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
		String coun= request.getParameter("country");
		String link3="https://www.worldometers.info/coronavirus/country/"+coun+"/";
		final Document document= Jsoup.connect(link2).get();
		//https://www.worldometers.info/coronavirus/

		HashMap<String , String> hm = new HashMap<String,String>();
		Elements element= document.select("#maincounter-wrap");
		element.forEach((e)->{
			String text = e.select("h1").text();
			String count= e.select(".maincounter-number>span").text();

hm.put(text,count);
		});
		request.setAttribute("hashMap",hm);
		request.getRequestDispatcher("corona.jsp").forward(request,response);
		
			}

}