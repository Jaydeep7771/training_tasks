import { useState } from "react";

function ProductForm({addProduct}) {
    const [product,setProduct]=useState({name:'', price:''})
    const handleSubmit=(e)=>{
        e.preventDefault();
        addProduct(product);
    }
    return ( 
        <div className="mt-3 p-2" style={{border:"2px solid blue"}}>
            <form onSubmit={handleSubmit}>

                <input type="text" name="name" placeholder="Enter name"
                onChange={(e)=> setProduct({... product,name: e.target.value})}
                className="form-control mt-3" />
                <input type="text" name="price" placeholder="Enter price"
                onChange={(e)=> setProduct({... product,price: e.target.value})}
                className="form-control mt-3" />
                <button type="submit" className="btn btn-primary mt-3">Add Product</button>
            </form>
        </div>
     );
}

export default ProductForm;