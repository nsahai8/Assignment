package NewsFeed.Assignment.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 	{

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
    @RequestMapping("/hi")
    public String hi(){
    	System.out.println("hi");
        return "Hello World!";
    }
//    @RequestMapping("/error")
//    public String error(HttpServletRequest request){
//    	System.out.println("-------------hello");
//    	Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//        
//        if (status != null) {
//            Integer statusCode = Integer.valueOf(status.toString());
//         
//            if(statusCode == HttpStatus.NOT_FOUND.value()) {
//                return "error-404";
//            }
//            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
//                return "error-500";
//            }
//        }
//		return "error";
//    }
//	@Override
//	public String getErrorPath() {
//		// TODO Auto-generated method stub
//		return "/error";
//	}
}