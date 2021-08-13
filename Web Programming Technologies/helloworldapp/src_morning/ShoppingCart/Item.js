import React from 'react';

class Item extends React.Component{
    constructor(props){
        super(props);
        //Initializing state by taking value from property
        this.state={ quantity:props.quantity};
    }
      
    render(){
        return(
            <div>
                <hr/>
                <p>Title:{this.props.title}</p>
                <img src={this.props.imageurl} width="100" height="100"/>
                <p>Quantity :{this.state.quantity}</p>
                <p>Unit Price:{this.props.unitprice}</p>
                <p>Amount:{this.props.unitprice * this.props.quantity} Rs.</p>
                <br/>
                <button>Remove</button>
            </div>
        );
    }
}
export default Item;