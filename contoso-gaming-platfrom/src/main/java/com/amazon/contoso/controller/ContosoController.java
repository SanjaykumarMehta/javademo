package com.amazon.contoso.controller;

import static com.amazon.contoso.constants.ApplicationConstants.API;
import static com.amazon.contoso.constants.ApplicationConstants.GET_DISTANCE;
import static com.amazon.contoso.constants.ApplicationConstants.INVALID_INPUT;
import static com.amazon.contoso.constants.ApplicationConstants.PATH;
import static com.amazon.contoso.constants.ApplicationConstants.PATH_NOT_FOUND;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;*/
import com.amazon.contoso.service.ContosoService;

//import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Validated
@RestController
@RequestMapping(API)
@Api(value = "contoso-gaming-platfrom")
public class ContosoController {
	
	@Autowired
	private ContosoService contosoService;
	
	

	/**
	 * Get Route Distance using path.
	 * 
	 * @param path
	 * @return Object
	 */
	@ApiOperation(value = "getRouteDistance", notes = "Get Route Distance")
	@GetMapping(path = GET_DISTANCE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Object> getRouteDistance(@RequestParam(name = PATH, required = true) @NotNull(message = INVALID_INPUT) String path) {
		if (path.isEmpty()) {
			return new ResponseEntity<>(INVALID_INPUT, HttpStatus.BAD_REQUEST);
		}
		int dist = contosoService.getPathDistance(path);

		if (dist < 0) {
			return new ResponseEntity<>(PATH_NOT_FOUND, HttpStatus.OK);
		}

		return new ResponseEntity<>(dist, HttpStatus.OK);
	}

}
