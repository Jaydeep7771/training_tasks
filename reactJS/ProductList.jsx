import { useState } from "react";
import ProductForm from "./ProductForm";
import ProductDetail from "./ProductDetail";

function ProductList() {
    const [products, setProducts] = useState([]);
    const [selected,setSelected] = useState(null);  
    const addProduct = (obj) => {
        obj.id = Math.floor(Math.random() * 1000);
        setProducts([...products, obj]);
        alert('Product Added Sucessfully')
    }

    return (
        <div className="container mt-2 p-2" style={{ border: '2px solid red' }}>
            <h3>Product List Component</h3>
            <table className="table table-bordered">
                <thead><tr><th>Id</th><th>Name</th><th>Price</th></tr></thead>
                <tbody>
                    {
                        products.map((item,index) => (
                            <tr key={index.id}>
                                <td>{item.id}</td>
                                <td>{item.name}</td>
                                <td>{item.price}</td>
                                <td><button onClick={()=>setSelected(item)}>View</button></td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
            <div className="row p-2">
                <div className="col">
            <ProductForm addProduct={addProduct} /></div>
            <div className="col">{selected && <ProductDetail product={selected}/>}</div>
        </div>
        </div>
    );
}

export default ProductList;