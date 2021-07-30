package service;

import javax.servlet.http.HttpServletRequest;

public class InvalidCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request) {
		
		return "index.jsp";
	}

}
