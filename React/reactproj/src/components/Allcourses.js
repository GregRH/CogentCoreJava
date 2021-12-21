import React, {useState} from "react";
import Course from "./Course";

const Allcourses = () =>{
	const [courses,setCourses]=useState([
		{title:"Java Course",desciption:"Become Java Certified"},
		{title:"Python Course",desciption:"Become Python Certified"},
		{title:"React Course", desciption:"Become react Certified"},
		{title:"Angular Course",desciption:"Become angular Certified"},
	])
	return(
			<div>
				<h1>All Courses</h1>
				<p>List of courses </p>
				{
					courses.length>0
					? courses.map((item)=><Course course={item}/>)
					:"No Course"
				}
			</div>
		);
};
export default Allcourses;