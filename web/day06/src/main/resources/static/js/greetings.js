const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("#login-form input");
const greeting = document.querySelector("#greeting");

const HIDDEN_CLASSNAME = "hidden";

const loginId = $('#loginId');
const loginEmail = $('#loginEamil');
const loginpwd = $('#loginpwd');
const loginvpwd = $('#loginvpwd');
const waringText = $('#waringtext');

function validateEmail(email) {
var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
return re.test(email);
}

function onLoginSubmit(){
	if( loginId.hasClass(HIDDEN_CLASSNAME) !== true ){	
		if(loginId.val() == ''){
		waringText.text(`hey! you don't write name`);
		return;
		}
		waringText.text(``);		
		loginId.addClass(HIDDEN_CLASSNAME);
		loginEmail.removeClass(HIDDEN_CLASSNAME);
		$('#loginBackBtn').removeClass(HIDDEN_CLASSNAME);
    	const username = loginId.val();
    	$('#login-form > h1').text(`What's your email, ${username}?`);
    	loginEmail.focus();  	
    	return;
	}else if (loginEmail.hasClass(HIDDEN_CLASSNAME) !== true ){	
		if(loginEmail.val() == '' || ! validateEmail(loginEmail.val())   ){
		waringText.text(`hey! it is Invalid email format.`);
		return;
		}
		waringText.text(``);		
		loginEmail.addClass(HIDDEN_CLASSNAME);
		loginpwd.removeClass(HIDDEN_CLASSNAME);
		$('#login-form > h1').text(`Please write a password`);
    	loginpwd.focus();
    	return;
	}else if (loginpwd.hasClass(HIDDEN_CLASSNAME) !== true ){
		if(loginpwd.val().length < 8){
		waringText.text(`Please write at least 8 characters`);
		return;
		}
		waringText.text(``);	
		loginpwd.addClass(HIDDEN_CLASSNAME);
		loginvpwd.removeClass(HIDDEN_CLASSNAME);
		$('#login-form > h1').text(`Please verifing your password`);
    	loginvpwd.focus();
    	return;
	}else if (loginvpwd.hasClass(HIDDEN_CLASSNAME) !== true ){
		if(loginpwd.val() !== loginvpwd.val()){
		waringText.text(`hey! check your password`);
		return;
		}
		$('#login-form').attr({
		'action':'registerok',
		'method':'post'
		});
		$('#login-form').submit();  
    }
};

function back (){
	if(loginId.hasClass(HIDDEN_CLASSNAME) == true  && loginEmail.hasClass(HIDDEN_CLASSNAME) !== true ){	
		$('#loginBackBtn').addClass(HIDDEN_CLASSNAME);
		loginId.removeClass(HIDDEN_CLASSNAME);
		loginEmail.addClass(HIDDEN_CLASSNAME);
		$('#login-form > h1').text(`Hello, What's your name?`);		
	}else if (loginEmail.hasClass(HIDDEN_CLASSNAME) == true && loginpwd.hasClass(HIDDEN_CLASSNAME) !== true ){	
		loginEmail.removeClass(HIDDEN_CLASSNAME);
		loginpwd.addClass(HIDDEN_CLASSNAME);
    	const username = loginId.val();	
    	$('#login-form > h1').text(`What's your email, ${username}?`);	
		
	}else if (loginpwd.hasClass(HIDDEN_CLASSNAME) == true && loginvpwd.hasClass(HIDDEN_CLASSNAME) !== true ){	
		loginpwd.removeClass(HIDDEN_CLASSNAME);
		loginvpwd.addClass(HIDDEN_CLASSNAME);
    	$('#login-form > h1').text(`Please write a password`);		
	}
	
};





$(document).ready(function(){
	
	$('#login-form').keyup(function(){
		if(window.event.keyCode == 13){
			onLoginSubmit();	
		}
	});

	$('#loginBackBtn').click(back);
	
	
});
