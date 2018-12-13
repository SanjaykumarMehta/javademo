<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html>
<head>
<title>RabbitMQ Tutorials</title>
<link rel="stylesheet" href="css/tutorial.css" type="text/css" />

</head>
<body>
 <div id="innerContainer" class="container">
	<h1>RabbitMQ Tutorials</h1>
	<p>
		These tutorials cover the basics of creating messaging
		applications using RabbitMQ.

	</p>
	<div class="nav-separator" style="background-color: green"></div>
	<div id="tutorial-index">
		<table id="tutorials">
			<tr>
			
				<td id="tutorial-one">
				   <h2><span class="tute-num">1</span> <a href="">"Hello World!"</a></h2>
					<p>
					    The simplest thing that does <em>something</em>
					</p>
					<p><img src="img/python-one.png" width="180" /></p>
					<div>
					    <font color="red">${errorMessage}</font>
					   
					    <form action="hello" method="post">
					        Input Message : <input type="text" name="message" />					        
					        <input type="submit" value="Submit"/>
					    </form>
					    
					    <a href="/getData">Click here</a> to manage your messages from queue.
					    <font color="green">${queueMessage}</font>
					</div>
				
				</td>
				
				
				<td id="tutorial-two">
					<h2><span class="tute-num">2</span> <a href="">Work queues</a></h2>
					<p>
					   Distributing tasks among workers competing consumers pattern
					</p>
					<p><img src="img/python-two.png" width="180" /></p>
					<div>
					    <font color="red">${workQueuesError}</font>
					   
					    <form action="workQueues" method="post">
					        Input Message : <input type="text" name="message" />					        
					         <input type="submit" value="Submit"/>
					    </form>
					    
					    <a href="/getWorkQueuesData">Click here</a> to manage your messages from queue.
					    <font color="green">${workQueueMessage}</font>
					</div>
				
				</td>
				
				
				<td id="tutorial-three">
					<h2><span class="tute-num">3</span> <a href="">Publish/Subscribe</a></h2>
					<p>
					   Sending messages to many consumers at once
					</p>
					<p><img src="img/python-three.png" height="50" width="180" /></p>
				    <div>
					    <font color="red">${pubSubQueuesError}</font>
					   
					    <form action="pubSubQueues" method="post">
					        Input Message : <input type="text" name="message" />					        
					         <input type="submit" value="Submit"/>
					    </form>
					    
					    <a href="/getPubSubQueuesData">Click here</a> to manage your messages from Pub-Sub queue.
					    <h5>Pub-Sub Queue 1 Message : <font color="green">${pubSubQueue1Message}</font></h5> 
					    <h5>Pub-Sub Queue 2 Message : <font color="green">${pubSubQueue2Message}</font></h5> 					     
					</div>
				</td>
			</tr>
			<tr>
				<td id="tutorial-four">
					<h2><span class="tute-num">4</span> <a href="">Routing</a></h2>
					<p>
						Receiving messages selectively
					</p>
					<p><img src="img/python-four.png" height="50" width="180" /></p>
				   <div>
					    <font color="red">${routingQueuesError}</font>
					   
					    <form action="routingQueues" method="post">
					        Input Message : <input type="text" name="message" />					        
					         <input type="submit" value="Submit"/>
					    </form>
					    
					    <a href="/getRoutingQueuesData">Click here</a> to manage your messages from Routing queue.
					    <h5>Routing Queue 1 Message : <font color="green">${routingQueue1Message}</font></h5> 
					    <h5>Routing Queue 2 Message : <font color="green">${routingQueue2Message}</font></h5> 					     
					</div>
				</td>
				
				
				<td id="tutorial-five">
					<h2><span class="tute-num">5</span> <a href="">Topics</a></h2>
					<p>
						Receiving messages based on a pattern (topics)
					</p>
					<p><img src="img/python-five.png" height="50" width="180" /></p>
				    <div>
					    <font color="red">${topicQueuesError}</font>
					   
					    <form action="topicQueues" method="post">
					        Input Message : <input type="text" name="message" />					        
					         <input type="submit" value="Submit"/>
					    </form>
					    
					    <a href="/getTopicQueuesData">Click here</a> to manage your messages from Topic queue.
					    <h5>Topic Queue 1 Message : <font color="green">${topicQueue1Message}</font></h5> 
					    <h5>Topic Queue 2 Message : <font color="green">${topicQueue2Message}</font></h5> 					     
					</div>
				</td>
				
				
				<td id="tutorial-six">
					<h2><span class="tute-num">6</span> <a href="">RPC</a></h2>
					<p>
						Request/reply pattern
					</p>
					<p><img src="img/python-six.png" height="50" width="180" /></p>
				    <div>				   
					    <form action="getRPCQueuesData" method="post">
					        Input Message : <input type="text" name="message" />					        
					         <input type="submit" value="Submit"/>
					    </form>
					    
					     <h4> Messages from RPC.</h4>
					    <h5>RPC Message : <font color="green">${rpcMessage}</font></h5> 					   					     
					</div>
				</td>
			</tr>
		</table>
	</div>
	<div class="nav-separator"></div>
  </div>
</body>
</html>