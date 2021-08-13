import  React from 'react';
import Order from './Order';

import data from '../data/orders.json';

class Orders extends React.Component{
    render(){
        const orders=data;

        return(
            <div>
                {
                     orders.map(item=>(
                                    <Order  id={item.id}
                                            customer={item.customer}
                                            orderdate={item.orderdate}
                                            amount={item.amount}
                                            status={item.status}/> 
                                ))
                } 
            </div>
        );
    }
}

export default Orders;