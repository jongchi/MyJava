package service;

import javax.servlet.http.HttpServletRequest;

public interface Command {

	String getPage(HttpServletRequest request);
}
