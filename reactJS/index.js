const express= require('express');
const prodcontrol = require('./productroutes');

const server = express();
server.use(express.json());
server.use('/api/product',prodcontrol)

server.use((req,res)=>{
    res.send("page not found");
})


server.listen(6000,()=>{
    console.log("started");
    
})

