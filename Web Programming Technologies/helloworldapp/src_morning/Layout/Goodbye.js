
import React from 'react';
class GoodBye extends React.Component{
    handleClick(){
        //send data to REST API 
        //and 
        
        this.props.history.push('/login');
    }
    render(){
        return(
                <div>
                    <h2>Thank you for accepting me as your Mentor</h2>
                    <button   className="btn btn-success"  onClick={()=>this.handleClick()}>Login</button>
                </div>
        );
    }
}
export default GoodBye;