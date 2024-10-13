package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import dao.LocateDAO;
import dto.LocateDTO;

@WebServlet("*.lsm")
public class Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); // 한글처리

		String uri = request.getRequestURI();
		String action = uri.substring(uri.lastIndexOf("/"));
	
		if (action.equals("/main.lsm")) {
			//forward
			String path = "./main.jsp"; 
			request.getRequestDispatcher(path).forward(request, response);
		} else if (action.equals("/locatePro.lsm")) {
			 // 문자 인코딩 설정
		    request.setCharacterEncoding("utf-8"); // 한글 처리
			
		    // JSON 데이터를 읽고 파싱
		    StringBuilder sb = new StringBuilder();
		    BufferedReader reader = request.getReader();
		    String line;
		    while ((line = reader.readLine()) != null) {
		        sb.append(line);
		    }
		    
		    // JSON 문자열을 파싱
		    JSONObject jsonRequest = new JSONObject(sb.toString());
		    request.setCharacterEncoding("utf-8"); // 한글 처리
		    
		    // JSON 데이터에서 값 추출
		    double xPosition = jsonRequest.getDouble("x"); // JSON에서 x값 가져오기
		    double yPosition = jsonRequest.getDouble("y"); // JSON에서 y값 가져오기
		    
		    // db 저장
		    LocateDAO dao = new LocateDAO();
		    LocateDTO dto = new LocateDTO(xPosition, yPosition);
		    dao.insertLocate(dto);
		    
		    response.setContentType("application/json; charset=utf-8");
		    jsonRequest.put("response", 0);
		} else if (action.equals("/history.lsm")) {
			LocateDAO dao = new LocateDAO();
			
			List<LocateDTO> dtos = dao.selectList(); 
			request.setAttribute("dtos", dtos);
			
			request.getRequestDispatcher("/history.jsp").forward(request, response);
		}
	}
}
