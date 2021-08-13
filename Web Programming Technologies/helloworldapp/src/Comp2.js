import React from 'react';
import  {connect} from 'react-redux';

class Comp2 extends React.Component{
    constructor()
    {
                super()
    }
    render(){
        return(
                <div>
                    <h2>My Posts </h2>
                    <hr/>
                    <ul>
                        {
                        this.props.posts.map(post=>(<li key={post.id}>{post.title}</li>))
                        }
                    </ul>
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
  
  export default connect(mapStateToProps,mapDispatchToProps)(Comp2)