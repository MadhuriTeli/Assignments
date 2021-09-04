package com.app.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.ITopicDao;
import com.app.dao.ITutorialDao;
import com.app.pojos.Topic;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	// dependency : Topic DAO layer i/f
	@Autowired
	private ITopicDao topicDao;
	
	@Autowired
	private ITutorialDao tutDao;
	

	@PostConstruct
	public void init() {
		System.out.println("in init of " + getClass().getName() + " " + topicDao);
	}

	// add request handling method to get all topics n share it with the view layer
	//2 way data binding => POJO  ---> form data n binding form data -->POJO 
	//1 . Create empty (def constr) POJO n add it under model map
	@GetMapping("/topics")
	public String showAllTopics(Model map) {
		System.out.println("in show all topics "+map);//{}
		// invoke dao's method to get all topics n save topic list under curnt request scope
		map.addAttribute("topic_list", topicDao.getAllTopics());
		map.addAttribute("myTopic",new Topic());//model(pojo) ---> form data(view)
		System.out.println(map);//{2 attrs : topic_list , myTopic}
		return "/customer/topics";//LVN --> AVN : /WEB-INF/views/customer/topics.jsp
	}
	//add a req handling method for getting selected topic id n generate list of tuts fro the topic
	//http://localhost:8080/day16_spring_boot_mvc/customer/tutorials?id=4  method : GET
	@GetMapping("/tutorials")
	public String showTutorialsByTopic(@ModelAttribute(name = "myTopic")  Topic topic1,Model map)
	{
		System.out.println("in show tuts "+topic1);//Topic : id : 4   topicName : null
		//invoke Tutorial Dao's method : for getting tuts 
		map.addAttribute("tut_names",tutDao.getAllTutorialsByTopic(topic1.getId()));
		return "/customer/tutorials";//AVN : /WEB-INF/views/customer/tutorials.jsp
	}
	//add req handling method for showing selected tut details
	@GetMapping("/tutorial_details")
	public String showTutorialDetails(@RequestParam String tut_name,Model map)
	{
		System.out.println("in show tut details "+tut_name);
		//invoke dao's method : to get selected tut details from DAO + inc visits (reco : to add service layer)
		map.addAttribute("selected_tut", tutDao.updateVisits(tut_name));
		return "/customer/tutorial_details";//AVN : /WEB-INF/views/customer/tutorial_details.jsp
	}

}
