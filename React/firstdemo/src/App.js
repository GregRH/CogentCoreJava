import React, {Component} from 'react';

import './App.css'

export const Component1 = () => (
    <div>
      <h1 className="green"> Hello React JS 1</h1>
      <h1 className="green"> Hello React JS 2</h1>
      <Component2></Component2>
    </div>
  )
class Component2 extends Component{
  name="James"
  age = 61
  render(){
    return(<div>
      <h1>Class Component {this.name}</h1>
      <h2>Age{this.age}</h2>
      </div>)
  }
}
