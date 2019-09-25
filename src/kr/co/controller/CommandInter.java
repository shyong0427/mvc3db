package kr.co.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandInter {
	String execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}