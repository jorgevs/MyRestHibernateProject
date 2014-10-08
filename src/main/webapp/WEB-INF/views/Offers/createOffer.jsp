<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>

<script type="text/javascript">

$.validator.setDefaults({
	submitHandler: function() { 
		alert("submitted!"); 
	
		
		var name = $('#name').val();  
	    var email = $('#email').val();  
	    var text = $('#text').val();  
	    var json = { "name" : name, "email" : email, "text": text };  
	  
	    console.log(JSON.stringify(json));
	    console.log($("#offerForm").attr("action"));
	
	
		$.ajax({
				url: $("#offerForm").attr("action"), 
				data: JSON.stringify(json),//$("#offerForm").serializeArray(), //JSON.stringify($(this).serializeArray()),
				type:'POST',				
				beforeSend: 	function(xhr) {  
		            				xhr.setRequestHeader("Accept", "application/json");  
		            				xhr.setRequestHeader("Content-Type", "application/json");  
		        				},
				success: 		function(result, status, xhr) {
	    							//alert("Success:" + result + ":" + status + ":" + xhr);
	    							$("#offerForm")[0].reset();
	    							$( "#name" ).focus();
								},
				error: 			function(xhr, status, error){
									alert("Error:" + xhr + ":" + status + ":" + error);
								}
		});		
		//e.preventDefault(); //STOP default action		
	
	}
});

jQuery(document).ready(function(){
		    
	$("#offerForm").validate({ 
		debug: true,
	    rules: { 
	    	name: {
	    		required: true,
	    		minlength: 2,
	    		maxlength: 20
	    	},
	    	email: { 
	    		required: true, 
	    		email: true 
	    	}, 
	    	text: { 
	    		required: true,
	    		minlength: 5,
	    		maxlength: 255
	    	}
	    },
	    messages: { 
		 
	    } 
	}); 
	
});


</script>


<!-- BEGIN PAGE CONTENT-->
<div class="row">
	<div class="col-md-10 col-md-offset-1">

	<div class="note note-success">
		<p id="offerMapNumber"></p>
		<br>
		<p id="offerMapOffers"></p>
	</div>
	
		<!-- BEGIN FORM PORTLET-->
		<div class="portlet box green ">
				
			<div class="portlet-body form">
			
				<sf:form id="offerForm" class="form-horizontal" method="post" action="${pageContext.request.contextPath}/offers" commandName="offer" role="form">  
					<div class="form-body">						
						
						<div class="form-group">
							<label class="col-md-3 control-label">Name</label>
							<div class="col-md-9">								
								<div class="input-group">
									<span class="input-group-addon">
										<i class="fa fa-user"></i>
									</span>
									<sf:input type="text" class="form-control" id="name" name="name" path="name" placeholder="Name" />
									<sf:errors path="name" cssClass="has-error" />
								</div>
								<span class="help-inline">
									 Firstname and lastname
								</span>
							</div>
						</div>
						
						<div class="form-group">
							<label class="col-md-3 control-label">Email Address</label>
							<div class="col-md-9">
								<div class="input-group">
									<span class="input-group-addon">
										<i class="fa fa-envelope"></i>
									</span>
									<sf:input type="email" class="form-control" id="email" name="email" path="email" placeholder="Email Address" />
									<sf:errors path="email" cssClass="has-error" />
								</div>
								<span class="help-inline">
									 Your gmail account
								</span>
							</div>
						</div>
						
						<div class="form-group">
							<label class="col-md-3 control-label">Textarea</label>
							<div class="col-md-9">								
								<sf:textarea class="form-control" id="text" name="text" path="text" rows="5" />
								<sf:errors path="text" cssClass="has-error" />										
							</div>
						</div>
						
					</div>
					<div class="form-actions fluid">
						<div class="col-md-offset-3 col-md-9">						
							<sf:button type="submit" class="btn btn-outline btn-primary" id="buttonCreate">Create offer</sf:button>							
							<sf:button type="button" class="btn btn-outline btn-primary">Cancel</sf:button>							
						</div>
					</div>
							

				</sf:form>
				
			</div>
		</div>
		<!-- END FORM PORTLET-->
		
	</div>
</div>
<!-- END PAGE CONTENT-->