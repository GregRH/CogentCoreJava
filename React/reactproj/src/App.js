import logo from "./logo.svg";
import "./App.css";
import React from "react";
import { Button, Container, Row, Col } from "reactstrap";
import { ToastContainer, toast } from "react-toastify";
import Home from "./components/Home";
import Course from "./components/Course";
import Allcourses from "./components/Allcourses";
import AddCourse from "./components/AddCourse";
import Header from "./components/Header";
import Menus from "./components/Menus";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
function App() {
  const btnHandle = () => {
    toast("This is my first message");
    toast.success("done");
    toast.error("error");
  };
  return (
    <div>
      <Router>
        <ToastContainer />
        <Container>
          <Header></Header>
          <Row>
            <Col md={4}>
              <Menus />
            </Col>
            <Col md={8}>
              <Routes>
                <Route path="/" component={Home} exact />
                <Route path="/add-course" component={AddCourse} exact />
                <Route path="/view-courses" component={Allcourses} exact />
              </Routes>
            </Col>
          </Row>
        </Container>
      </Router>
    </div>
  );
}
export default App;