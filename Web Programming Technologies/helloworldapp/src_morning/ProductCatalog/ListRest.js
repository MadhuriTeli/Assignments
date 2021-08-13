import React from 'react';
import Product from './Product';

class RestList extends React.Component{

    constructor(props){
        super(props);

        //
        this.state={products:[]};
    }

    componentDidMount(){
        //fetch data from rest api 

        //GET request
        fetch('http://localhost:9898/api/flowers')
          .then(
              async response=>{
                  const data=await response.json();
                  if(!response.ok){
                      const error=(data && data.message) || response.statusText;
                      return Promise.reject(error);
                  }
                  this.setState({products:data})
                  console.log(data);
              })
              .catch(error=>{
                  this.setState({errorMessage:error.toString()});
                  console.log("There was an error while fetching data" + error);
              })

    }

    render(){    
        return(
            
            <div>
                {
                    
                    this.state.products.map(item=>(
                                                    <Product title={item.Title}
                                                            description={item.Description}
                                                            imageurl={item.ImageUrl}
                                                            unitprice={item.UnitPrice}
                                                            quantity={item.Quantity}
                                                            likes={item.likes}/> 
                                            ))
                } 
            </div>
        );
    }   
}

export default RestList;