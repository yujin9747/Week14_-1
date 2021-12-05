package com.my.myapp;

import java.util.* ;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/boardlist", method = RequestMethod.GET)
	public String boardList(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		List<String> posts = new ArrayList<>() ;
		posts.add("¿À´Ã ³¯¾¾ ³Ê¹« ÁÁ¾Æ¿ä") ;
		posts.add("¿À´Ã Á¡½É ¹¹ ¸ÔÀ»±î¿ä?") ;
		posts.add("SpringÀº ½¬¿ï±î?") ;
		model.addAttribute("list", posts) ;
		
		return "board/list";
	}
	

}
