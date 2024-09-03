let todos=[];

function addTodo(todo){
    todos.push(todo);
    console.log(todo,"added");
}

function removeTodo(id){
    let flag=-1;
for(let i=0;i<todos.length;i++){
    if (todos[i].id==id) {
        flag=i;
        break;
    }
}
if (flag>0) {
    todos.splice(flag,1);
    console.log("Todo deleted");
        }
else{
    console.log('No element found');
}

}

function getAllTodos(){
    return todos;
}

function completeTodo(id){
    for (let index = 0; index < todos.length; index++) {
        if (todos[i].id==id) {
            todos[i].completed=true;
            log('todo updated');
            
        }
        
    }
}