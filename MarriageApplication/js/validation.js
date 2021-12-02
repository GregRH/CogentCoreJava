/**
 * 
 */
function validate(frm){
	alert("client side...")
	document.getElementById("nameErr").innerHTML="";
	document.getElementById("ageErr").innerHTML="";
	
	let name=frm.pname.value;
	let age=frm.page.value;
	let flag=true;
	
	if(name=""){
		document.getElementById("nameErr").innerHTML="<i>person nameis required</i>";
		frm.pname.focus();
		flag=false;
	}
	else if(name.length<5){
		document.getElementById("nameErr").innerHTML="Person name must have min of 5 chars";
		frm.pname.focus();
		flag=false;
	}
	if (age == "") {
		document.getElementById("ageErr").innerHTML = "person age is required";
		frm.page.focus();
		flag = false
	}
	else if (isNaN(age)) {
		document.getElementById("ageErr").innerHTML = "person age must be numeric value";
		frm.page.focus();
		flag = false
	}
	else if(age<1||age>125){
		document.getElementById("ageErr").innerHTML ="person age must be between 1 through 125";
		frm.page.focus();
		flag=false
	}
	frm.vflag.value="yes";
	return flag;
}