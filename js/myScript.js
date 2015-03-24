$(document).ready(function() {
	"use strict"
	var host = "http://private-cb1d-musicforum.apiary-mock.com/";

	$.get(host + "instruments").then(function(response) {
		var myDropdown = $('#instrumentSelect');
		$.each(response, function() {
			var instName = this.name;
			myDropdown.append($('<option></option>').val(instName).html(instName));
		});
	});

	$("#userSubmit").click(function() {
		$.post(host + "users", {
			"username": $("#userform #userName").val(),
			"e-mail": $("#userform #email").val(),
			"password": $("#userform #password").val(),
			"sex": $('input[name=sexradio]:checked', '#userform').val()
		}).then(function(response) {
			console.log(response);
		});
	});

	$("#adSubmit").click(function() {
		var ischecked = 0;
		if($('input[name=isradio]:checked', '#adform').val() == "1"){
			ischecked = 1;
		}
		$.post(host + "users", {
			"created_by": $("#adform #userName").val(),
			"is_looking": ischecked,
			"instrument": $('#adform #instrumentSelect:selected').text(),
			"city": $('input[name=sexradio]:checked', '#adform').val()


		}).then(function(response) {
			console.log(response);
		});
	});

	$("#adSubmit").click(function() {

		alert($("#instrumentform #userName").val());
		if($("#instrumentform #userName").val() == "puh"){
			$.post(host + "instruments", {
				"created_by": $("#instrumentform #userName").val(),
				"name": $('#instrumentform #instrument').val()
			}).then(function(response) {
				console.log(response);
			});
		}else{
			alert("You ain't no Puh!");
		}
	});


});