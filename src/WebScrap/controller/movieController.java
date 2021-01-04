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

import WebScrap.utils.*;


public class movieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	
    public movieController() {
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
		final Document document= Jsoup.connect(link2).get();
		HashMap<String , String> hm = new HashMap<String,String>();
		//http://www.imdb.com/chart/top
		for(Element row:document.select("table.chart.full-width tr")){
			final String title = row.select(".titleColumn a").text();
			final String rating = row.select(".imdbRating").text();
			
			hm.put(title,rating);
	
		
		}

		request.setAttribute("hashMap",hm);
		request.getRequestDispatcher("movie.jsp").forward(request,response);
		
			}

}
