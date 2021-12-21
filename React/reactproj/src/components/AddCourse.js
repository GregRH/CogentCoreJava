import React from "react";
import {Fragment} from "react";
import {Form, FormGroup, Input, Button} from "reactstrap";
import {Container }from "reactstrap";

const AddCourse=()=>{(
	<Fragment>
		<Form>
			<FormGroup>
				<label for="userId">Course Id </label>
				<input
				type="text"
				placeholder="Enter here"
				name="userId"
				id="userId"/>
			</FormGroup>
			<Container className="text-center">
				<Button color="success">Add Course</Button>
				<Button color="warning ml-2">Clear</Button>
			</Container>
		</Form>
	</Fragment>
	);

};
export default AddCourse;