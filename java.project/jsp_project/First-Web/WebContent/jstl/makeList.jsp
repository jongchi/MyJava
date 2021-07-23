<%@page import="java.util.ArrayList"%>
<%@page import="member.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	List<Member> members = new ArrayList<Member>();
	members.add(new Member("cool01", "1111", "Cool00"));
	members.add(new Member("cool02", "1111", "Cool00"));
	members.add(new Member("cool03", "1111", "Cool00"));
	members.add(new Member("cool04", "1111", "Cool00"));
	members.add(new Member("cool05", "1111", "Cool00"));
	members.add(new Member("cool06", "1111", "Cool00"));
	members.add(new Member("cool07", "1111", null));
	members.add(new Member("cool08", "1111", "Cool00"));
	members.add(new Member("cool09", "1111", "Cool00"));
	members.add(new Member("cool10", "1111", null));
	
	session.setAttribute("members", members);
%>