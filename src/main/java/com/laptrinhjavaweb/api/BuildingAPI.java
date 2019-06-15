package com.laptrinhjavaweb.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.impl.BuildingService;
import com.laptrinhjavaweb.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-admin-building"})
public class BuildingAPI extends HttpServlet{

	private static final long serialVersionUID = -915988021506484384L;
	
	private IBuildingService buildingService;
	
	public BuildingAPI() {
		buildingService = new BuildingService();
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		BuildingDTO buildingDTO = HttpUtil.of(request.getReader()).toModel(BuildingDTO.class);
		
		buildingDTO = buildingService.save(buildingDTO);
		mapper.writeValue(response.getOutputStream(), buildingDTO);
	} 
	
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		BuildingDTO buildingDTO = HttpUtil.of(request.getReader()).toModel(BuildingDTO.class);
		buildingDTO = buildingService.update(buildingDTO);
		mapper.writeValue(response.getOutputStream(), buildingDTO);
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		BuildingDTO buildingDTO = HttpUtil.of(request.getReader()).toModel(BuildingDTO.class);
		buildingDTO = buildingService.delete(buildingDTO);
		mapper.writeValue(response.getOutputStream(), buildingDTO);
	}
	
}













