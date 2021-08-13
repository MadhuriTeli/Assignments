import React from 'react';
import './App.css';

import { connect } from 'react-redux';
import Comp1 from './Comp1';
import Comp2 from './Comp2';
import Comp3 from './Comp3';
export class App extends React.Component {

  constructor()
  {
    super();
  }

  render() {
    return (
      <div className="App">
        <h2>Simple Redux Demo</h2>
       
        <Comp1></Comp1>
        <hr/>
        <hr/>
        <hr/>
        <Comp2></Comp2>
        <hr/>
        <Comp3></Comp3>
      </div>
    );
  }
}

const mapStateToProps=state=>{
  return {posts:state.posts};
}
const mapDispatchToProps=dispatch=>{
  return {dispatch}
}

export default connect(mapStateToProps,mapDispatchToProps)(App)
