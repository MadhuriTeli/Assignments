import { useEffect,useState } from "react";
//Basic Hooks:  useState  useEffect  useContext  useReducer  userCallback useRef

function CounterExample(){
    const [count,setCount]=useState(0);
    useEffect(()=>{
        document.title=`You Clicked ${count} times`;
    });

    return(
        <div>
            <p> You Clicked {count}</p>
            <button onClick={()=>setCount(count+1)}>Click Me</button>

        </div>
    )
}
export default CounterExample;