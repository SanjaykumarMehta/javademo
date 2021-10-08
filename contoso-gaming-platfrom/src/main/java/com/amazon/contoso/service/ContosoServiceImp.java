package com.amazon.contoso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ContosoServiceImp implements ContosoService {
	
	@SuppressWarnings("serial")
	Map<String, Integer> myMap = new HashMap<>() {{
        put("AB", 3);
        put("BC", 9);
        put("CD", 3);
        put("DE", 6);
        put("AD", 4);
        put("DA", 5);
        put("CE", 2);
        put("AE", 4);
        put("EB", 1);
    }};
	
	/**
	 * Get Route Distance using path.
	 * 
	 * @param path
	 * @return int Distance Value
	 */
	@Override
	public int getPathDistance(String path){	      
	      List<String> pathList = new ArrayList<>(Arrays.asList(path.split("-")));
	      int dist = 0; 
	      if(!pathList.isEmpty()) {
	    	  for(int i=0;i<pathList.size()-1;i++){
		          String point1 = pathList.get(i);
		          String point2 = pathList.get(i+1);
		          
		          String pathValue = point1.concat(point2);
		          if( myMap.containsKey(pathValue)){
		              dist += myMap.get(pathValue);
		          }else{
		              dist = -1;
		          }
		      }
	      }else {
	    	  dist = -1;
	      }	      
	      
	      return dist;
	}

}
