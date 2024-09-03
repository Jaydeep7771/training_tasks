const express=require('express');
const storage =require('node-persist');
storage.init();

const router = express.Router();

router.post("/",async(req,res)=>{
    const {id,name,price,quantity}=req.body;
    storage.setItem(id,{id,name,price,quantity});
    res.status(201).send('user registered sucessfully')
    })
    
    
    router.get("/",async(req,res)=>{
        const data= await storage.values();
        res.status(200).send(data);
        
        
    })

    router.get("/:id",async(req,res)=>{
        const id= req.params.id;
        const data= await storage.getItem(id);
        res.status(200).send(data);
       
    })
    router.get("/search/:name",async(req,res)=>{
        const name1= req.params.name;
        const data= await storage.values();
        const array = await data.filter(item=>item.name==name1)
        if (array) {
            return res.send(array);
        }
        else{
            res.send('product nt found');
        }
        res.status(200).send(data);
       
    })
    
    




    router.put("/:id",async(req,res)=>{
        const {id,name,price,quantity}=req.body;
        storage.setItem(id,{id,name,price,quantity});
res.status(201).send('user UPDATED sucessfully')
})


    

    module.exports=router;