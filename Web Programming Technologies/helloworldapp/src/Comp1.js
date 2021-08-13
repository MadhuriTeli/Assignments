import React from 'react';
import {connect} from 'react-redux';
class Comp1 extends React.Component{
    constructor(){
        super();
        this.state={
            value:'',
            postId:2
        }
        this.handleChange = this.handleChange.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    handleChange(event){
        this.setState({value:event.target.value});
    }
    handleSubmit(event){
        event.preventDefault();
        this.props.dispatch({
                            type:'ADD_POST',
                            payload:{id:this.state.postId, title:this.state.value}
                            })
        this.setState({postId:this.state.postId+1});
    }

    render(){
        return( <div>
                    <form onSubmit={this.handleSubmit} >
                        <input type="text" value={this.state.value} onChange={this.handleChange}/>
                        <hr/>
                        <button  type="submit" onClick={this.handleSubmit}>Submit</button>
                    </form>
                </div>
            )
       
    }
}

const mapStateToProps = state => {
    return { posts: state.posts }
  }
  
  const mapDispatchToProps = dispatch => {
    return {
      dispatch
    }
  } 
  
  export default connect(mapStateToProps,mapDispatchToProps)(Comp1)