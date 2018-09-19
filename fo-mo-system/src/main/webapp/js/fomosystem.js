$(function(){
	var context ="/fomosystem"
	/*$("#submitId").click(function(){
		var fileName = $('#reconFileId').val();
		var tradeId = $('#tradeId').val();
		var cpId = $('#counterPartyId').val();
		var filterObj = new Object();
		filterObj.fileName = fileName;
		filterObj.tradeId = tradeId;
		filterObj.cpId = cpId;
		$.get(context+'/loadReconReports',filterObj,function(data,status){
			$('#view').html(data);
		})*/
		
	$("#foId").click(function(){
		$.get(context+'/loadFoPage',function(data,status){
			$('#view').html(data);
		});
		});
	$("#moId").click(function(){
		$.get(context+'/loadMoPage',function(data,status){
			$('#view').html(data);
		});
	});
	$("#homeId").click(function(){
		$('#view').html("<P><h5>Front Office Page</h5></p>");
	});
		
});
