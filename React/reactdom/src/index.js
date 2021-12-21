import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import {Component1} from './App';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <Component1 name="James" course="React"/>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
