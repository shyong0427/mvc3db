package kr.co.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.model.ProductBean;
import kr.co.model.SangpumModel;

public class SangpumImpl implements CommandInter {
	private static SangpumImpl impl = new SangpumImpl();
	
	public static SangpumImpl instance() {
		return impl;
	}
	
	// 같은 method 이름을 갖게하기 위해 interface를 사용했다.
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 컨트롤러 영역 내의 클래스로 모델 영역의 클ㄹ스와 통신 목적
		SangpumModel model = SangpumModel.instance();
		ArrayList<ProductBean> list = (ArrayList<ProductBean>)model.selectDataAll(); 
		request.setAttribute("data", list);
		
		return "sangpum.jsp";
	}
}
