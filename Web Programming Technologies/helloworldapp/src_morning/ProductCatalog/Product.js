import React from 'react';
import Counter from './Counter';
class Product extends React.Component{

    constructor(props){
        super(props);
        //Initializing state by taking value from property
        this.state={ likes:props.likes,
                     title:props.title,
                     description:props.description
        };
        this.handler=this.handler.bind(this);   /// Event Binding association
    }
    
    //callback function
    handler(data){

        //data sent by child  will be set to state of parent
        //change the state of Product Likes
        this.setState({likes:data});
    }
    
    render(){
        return(
            <div>
                <h3>Flower Details</h3>
                <hr/>
                <p>Title:{this.props.title}</p>
                <img src={this.props.imageurl} width="100" height="100"/>
                <p>Description:{this.props.description}</p>
                <p>Quantity available:{this.props.quantity}</p>
                <p>Unit Price:{this.props.unitprice}</p>
                <p>Likes:{this.state.likes}</p>
                <Counter count ={this.props.likes}   handler={this.handler}></Counter>
                <br/>
                <button>Add to cart</button>
            </div>
        );
    }
}
export default Product;