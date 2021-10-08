# contoso-gaming-platfrom
The Contoso Gaming Platfrom API implemented using SpringBoot


## API DOCS
http://localhost:8080/swagger-ui.html#/

http://localhost:8080/api/route/getdistance?path=A-B-C

curl -X GET "http://localhost:8080/api/route/getdistance?path=A-B-C" -H "accept: application/json"


All actors are tagged to the Landmarks and the purpose of
the API is to provide routes between landmarks to suggest routes to the actors. In order to achieve this,
the game engine should be able to calculate
 
The distance along certain routes via landmarks
The number of different routes between landmarks.

The Program should be able to answer following question -
 
1. The distance between landmarks via the route A-B-C .
2. The distance between landmarks via the route A-E-B-C-D.
3. The distance between landmarks via the route A-E-D .
4. The number of routes starting at A and ending at C with a maximum of 2 stops.
