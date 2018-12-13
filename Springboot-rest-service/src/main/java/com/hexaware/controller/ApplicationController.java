package com.hexaware.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.hexaware.entity.User;
import com.hexaware.io.ExampleInputForm;
import com.hexaware.io.ExampleOutputForm;
import com.hexaware.service.UserService;
import com.hexaware.utils.EntityNotFoundException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="/hexaware")
@Api
public class ApplicationController {
	 private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);
	
	@Value(value = "${welcome.message}")
	private String name;
	
	
	@Autowired
    private UserService userService;
	
	
	@ApiOperation(value = "This method get Employee Name", notes = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "OK",response = ExampleOutputForm.class),
	        @ApiResponse(code = 201, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 400, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 401, message = "Unauthorized" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 403, message = "Forbidden" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 404, message = "Not Found" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 500, message = "Internal Server error" ,response = ExampleOutputForm.class)}
	)	
	@RequestMapping(value = "/api/getData",consumes = {MediaType.APPLICATION_JSON_VALUE} ,produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
    public ExampleOutputForm run(@Validated @RequestBody ExampleInputForm inputForm) {
		 logger.info("Messages:  "+name);
        return new ExampleOutputForm(inputForm.getName()+",  Message: "+name);
    }
	
	
	@ApiOperation(value = "This method get User details by Id", notes = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "OK",response = ExampleOutputForm.class),
	        @ApiResponse(code = 201, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 400, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 401, message = "Unauthorized" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 403, message = "Forbidden" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 404, message = "Not Found" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 500, message = "Internal Server error" ,response = ExampleOutputForm.class)}
	)	
	@RequestMapping(value = "/user/{id}" ,produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

	@ApiOperation(value = "This method add User details", notes = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "OK",response = ExampleOutputForm.class),
	        @ApiResponse(code = 201, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 400, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 401, message = "Unauthorized" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 403, message = "Forbidden" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 404, message = "Not Found" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 500, message = "Internal Server error" ,response = ExampleOutputForm.class)}
	)	
	@RequestMapping(value = "/user/create",consumes = {MediaType.APPLICATION_JSON_VALUE} ,produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
   	public Object createUser(@RequestBody User user){
        System.out.println("Creating User "+user.getName());
        userService.createUser(user);
        return new ResponseEntity<User>(user , HttpStatus.CREATED);
    }

	@ApiOperation(value = "This method get Users details", notes = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "OK",response = ExampleOutputForm.class),
	        @ApiResponse(code = 201, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 400, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 401, message = "Unauthorized" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 403, message = "Forbidden" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 404, message = "Not Found" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 500, message = "Internal Server error" ,response = ExampleOutputForm.class)}
	)	
	@RequestMapping(value = "/user/get",produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
   	public Object getAllUser() {
		logger.info("ApplicationController: getAllUser Method");
      List<User> tasks=userService.getUser();
        if (tasks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(tasks,HttpStatus.OK);
        

    }

	@ApiOperation(value = "This method update User details", notes = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "OK",response = ExampleOutputForm.class),
	        @ApiResponse(code = 201, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 400, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 401, message = "Unauthorized" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 403, message = "Forbidden" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 404, message = "Not Found" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 500, message = "Internal Server error" ,response = ExampleOutputForm.class)}
	)	
	@RequestMapping(value = "/user/update",consumes = {MediaType.APPLICATION_JSON_VALUE} ,produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.PUT)
   	public Object updateUser(@RequestBody User currentUser)
    {
		logger.info("ApplicationController: updateUser Method");
        User user = userService.findById(currentUser.getId());
        if (user==null) {
            return new ResponseEntity<String>("User Information not update because user not found",HttpStatus.NOT_FOUND);
        }
        userService.update(currentUser, currentUser.getId());
        return new ResponseEntity<User>(currentUser,HttpStatus.OK);
    }

	@ApiOperation(value = "This method delete User details", notes = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "OK",response = ExampleOutputForm.class),
	        @ApiResponse(code = 201, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 400, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 401, message = "Unauthorized" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 403, message = "Forbidden" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 404, message = "Not Found" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 500, message = "Internal Server error" ,response = ExampleOutputForm.class)}
	)	
	@RequestMapping(value = "/user/deleteuser/{id}",produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.DELETE)
   	public ResponseEntity<String> deleteUser(@PathVariable("id") long id){
		logger.info("ApplicationController: deleteUser Method");
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<String>("User Information Not Found",HttpStatus.NOT_FOUND);
        }
        userService.deleteUserById(id);
        return new ResponseEntity<String>("User Information Delete Successfully",HttpStatus.OK);
    }

	@ApiOperation(value = "This method update User details Partially", notes = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "OK",response = ExampleOutputForm.class),
	        @ApiResponse(code = 201, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 400, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 401, message = "Unauthorized" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 403, message = "Forbidden" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 404, message = "Not Found" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 500, message = "Internal Server error" ,response = ExampleOutputForm.class)}
	)	
	@RequestMapping(value = "/user/updateUserPartially/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE} ,produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.PATCH)
   	public Object updateUserPartially(@PathVariable("id") long id, @RequestBody User currentUser){
		logger.info("ApplicationController: updateUserPartially Method");
		User user = userService.findById(id);
        if(user ==null){
            return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
        }
        User usr = userService.updatePartially(currentUser, id);
        return new ResponseEntity<User>(usr, HttpStatus.OK);
    }
	
	
	@ApiOperation(value = "Find User Details as per By Name , By Id, By Country", notes = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "OK",response = ExampleOutputForm.class),
	        @ApiResponse(code = 201, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 400, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 401, message = "Unauthorized" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 403, message = "Forbidden" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 404, message = "Not Found" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 500, message = "Internal Server error" ,response = ExampleOutputForm.class)}
	)	
	@RequestMapping(value = "/user/info",consumes = {MediaType.APPLICATION_JSON_VALUE} ,produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
    public Object getByNameOrIdOrCountry(@Validated @RequestBody User userValue) throws EntityNotFoundException {
		logger.info("ApplicationController: getByUserName Method");
		List<User> user = userService.findByNameOrIdOrCountry(userValue);
		if (user.isEmpty()) {
			throw new EntityNotFoundException(User.class, "id", userValue.toString());
            //return new ResponseEntity<>("User Not Found",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<User>>(user,HttpStatus.OK);
    }
	
	
	@ApiOperation(value = "This method get healthCheck of rest Service", notes = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "OK",response = ExampleOutputForm.class),
	        @ApiResponse(code = 201, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 400, message = "" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 401, message = "Unauthorized" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 403, message = "Forbidden" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 404, message = "Not Found" ,response = ExampleOutputForm.class),
	        @ApiResponse(code = 500, message = "Internal Server error" ,response = ExampleOutputForm.class)}
	)	
	@RequestMapping(value = "/healthCheck",produces = {MediaType.APPLICATION_JSON_VALUE}, method = {RequestMethod.GET, RequestMethod.POST})
    public HashMap<String,String> healthCheck() {
		HashMap<String,String> map = new HashMap<>();
		map.put("status", "Running");		
        return map;
    }

}
