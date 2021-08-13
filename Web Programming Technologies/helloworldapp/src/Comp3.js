import React from 'react';
import  {connect} from 'react-redux';

class Comp3 extends React.Component{
    constructor()
    {
                super()
    }
    render(){
        return(
                <div>
                    <h2>My Numerical Posts </h2>
                    <hr/>
                    <ol>
                        {
                        this.props.posts.map(post=>(<li key={post.id}>{post.title}</li>))
                        }
                    </ol>
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
  
  export default connect(mapStateToProps,mapDispatchToProps)(Comp3)