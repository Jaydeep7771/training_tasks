import { useState } from "react";

function TodoApp() 
{
    const [todos,setTodos]=useState([]);
    const [task,setTask]=useState('');
    const handelSubmit=(e)=>{
        e.preventDefault();
        setTodos([...todos,{id:Date.now(),task,completed:false}]);
        setTask('');
    }
    const updateTask=(id)=>{
        setTodos(todos.map(item=>{
            if(item.id == id){
                item.completed =  !item.completed;
            }
            return item;
        }))
    }
    const deleteTask=(id)=>{
        setTodos(todos.filter(item=>item.id!==id));
    }    

    return ( 
        <div className="container">
            
            <form onSubmit={handelSubmit}>
                <input type="text" className="form-control" placeholder="Enter your task" name="task" 
                onChange={(e)=>setTask(e.target.value)} value={task}/>

                <button type="submit" className="btn btn-primary mt-3">Add task</button>
            </form>
            <h3>Todo List</h3>
            <ul className="list-group">
                
                {
                    todos.map(item=>(
                        <li className="list-group-item" key={item.id}
                        style={{textDecoration:`${item.completed?'line-through':''}`}}>
                            {item.task} {item.completed?'Completed':'pending'}
                            <button onClick={()=>updateTask(item.id)}>update</button>
                            <button onClick={()=>deleteTask(item.id)}>delete</button>
                        </li>
                    ))


                }

            </ul>
        </div>
     );
}

export default TodoApp;