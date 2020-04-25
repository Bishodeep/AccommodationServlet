package com.accomodation.welcom;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accommodation.filter.Filter;
import com.accomodation.model.RoomModel;
import com.accomodation.model.RoomTypeModel;
import com.accomodation.roomdao.RoomDao;
import com.accomodation.roomdao.RoomTypeDao;

public class WelcomeAdminServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException {
		
		List<RoomTypeModel> listRoomType=RoomTypeDao.getRoomtype();
		request.setAttribute("listRoomType", listRoomType);
		
		List<RoomModel> listRooms = RoomDao.getRooms();
		request.setAttribute("listRoom", listRooms);
		Filter.getPage(request, response,"welcomeadmin").forward(request, response);
	}
}
