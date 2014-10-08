<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- BEGIN PAGE CONTENT-->
<div class="row">
	<div class="col-md-10 col-md-offset-1">
		<div class="note note-success">
			<p>
				 Please try to re-size your browser window in order to see the tables in responsive mode.
			</p>
		</div>
		
		<!-- BEGIN SAMPLE TABLE PORTLET-->
		<div class="portlet box blue">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-cogs"></i>List of existing offers
				</div>
				<div class="tools">
					<a href="javascript:;" class="collapse">
					</a>
					<a href="#portlet-config" data-toggle="modal" class="config">
					</a>
					<a href="javascript:;" class="reload">
					</a>
					<a href="javascript:;" class="remove">
					</a>
				</div>
			</div>
			<div class="portlet-body">
				<div class="table-responsive">
					<table class="table table-striped table-condensed table-hover">
					<thead>
					<tr>
						<th>
							 ID
						</th>
						<th>
							 Name
						</th>
						<th>
							 Email
						</th>
						<th>
							 Text
						</th>
					</tr>
					</thead>
					<tbody>
					
					<c:forEach var="offer" items="${offerList}">
				    	<tr>
				    		<td><c:out value="${offer.id}"/></td>
				    		<td><c:out value="${offer.name}"/></td>
				    		<td><c:out value="${offer.email}"/></td>
				    		<td><c:out value="${offer.text}"/></td>
				    	</tr>
					</c:forEach>					
													
					</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- END SAMPLE TABLE PORTLET-->
		
		
	</div>
</div>
<!-- END PAGE CONTENT-->