function validateName(){
	var name = document.getElementById("commentName").value;
	if(name.length==0){
		producePrompt("Name is required", "commentNamePrompt","red");
		return false;
	}
	if(!name.match(/^[A-Za-z]*\s{1}[A-Za-z]*$/)){
		producePrompt("First and last name please", "commentNamePrompt","red");
		return false;
	}
	producePrompt("Welcome "+ name, "commentNamePrompt","green");
	return true;
}
function validatePhone(){
	var phone = document.getElementById("commentPhone").value;
	if(phone.length==0){
		producePrompt("phone number is required","commentPhonePrompt","red");
		return false;
	}
	if(phone.length!=10){
		producePrompt("Phone number must include area code","commentPhonePrompt","red");
		return false;
	}
	if(!phone.match(/^[0-9]{10}/)){
		producePrompt("Please only include digits","commentPhonePrompt","red");
		return false;
	}
	producePrompt("valid number", "commentPhonePrompt","green");
	return true;

}
function validateEmail(){
	var email = document.getElementById("commentEmail").value;
	if(email.length==0){
		producePrompt("Email is required", "commentEmailPrompt","red");
		return false;
	}
	if(!email.match(/^[A-Za-z._\-0-9]*[@][A-Za-z]*[\.][a-z]{2,3}$/))
	{
		producePrompt("Email address invalid", "commentEmailPrompt","red");
		return false;
	}
	producePrompt("Email address valid", "commentEmailPrompt","green");
	return true;
}
function validateMessage(){
	var comment = document.getElementById("commentMessage").value;
	var required=30;
	var left = required - comment.length;
	if(left > 0){
		producePrompt(left + " Characters required ", "commentMessagePrompt", "red");
		return false; 
	}
	producePrompt("valid comment", "commentMessagePrompt", "green");
	return true;
}
function producePrompt(message, promptLocation,color){
	document.getElementById(promptLocation).innerHTML=message;
	document.getElementById(promptLocation).style.color=color;
}
