const toDoForm = document.getElementById("todo-form");
const toDoInput = toDoForm.querySelector("input");
const toDoList = document.querySelector("#todo-list");

const TODOS_KEY = "todos"

let toDos = []; 

function saveToDos(){
    localStorage.setItem(TODOS_KEY, JSON.stringify(toDos)); //JSON.stringify() => 값을 모두 String으로 바꿔주는 함수
};

function deleteToDo(event){
    const li = event.target.parentElement; // click하였을때 나오는 버튼의 부모를 지정하여 준다.
    li.remove();
    toDos = toDos.filter((toDo) => toDo.id !== parseInt(li.id));
    saveToDos();
};

function paintToDo(newToDo){
    const li = document.createElement("li");
    li.id = newToDo.id;
    const span = document.createElement("span");
    span.innerText = newToDo.text;
    const button = document.createElement("button");
    button.innerText = "❌"
    const br = document.createElement("span");
    br.innerText = "\n";
    button.addEventListener("click", deleteToDo)  // 클릭하면 deleteToDo가 실행됨.
    li.appendChild(span);
    li.appendChild(button);
    li.appendChild(br);
    toDoList.appendChild(li);
};

function handelToDoSubmit(event){
    event.preventDefault();    
    const newToDo = toDoInput.value;
    toDoInput.value ="";  
    const newToDoObj = {
        text : newToDo,
        id : Date.now(),
    };
    toDos.push(newToDoObj);
    paintToDo(newToDoObj);
    saveToDos();
};

toDoForm.addEventListener("submit", handelToDoSubmit);

// function sayHello(item){
//     console.log("This is turn of", item)
// }

const savedToDos = localStorage.getItem(TODOS_KEY);
if(savedToDos !== null ){
    const parseToDos = JSON.parse(savedToDos);
    toDos = parseToDos;
    parseToDos.forEach(paintToDo);
};


function sexyFilter(){ };

