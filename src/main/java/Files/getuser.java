package Files;

import java.io.IOException;
import java.util.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

/**
 * Servlet implementation class getuser
 */
public class getuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.addHeader("Access-Control-Allow-Origin","*");
		response.addHeader("Access-Control-Allow-Methods","*");
		
		PrintWriter out = response.getWriter(); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/water", "root", "6342");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select *from mac");
			ArrayList<HashMap> users = new ArrayList();
			while(rs.next()) {
				HashMap<String,String> map = new HashMap();
				map.put("id",rs.getString("id"));
				map.put("name",rs.getString("name"));
				map.put("age",rs.getString("age"));
				users.add(map);
			}
			JSONArray userjson = new JSONArray(users);
			out.print(userjson);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  PrintWriter out = response.getWriter();
		  out.write("wellcome in post");
		}
	

}
