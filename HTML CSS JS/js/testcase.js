const arr1=[1,2,3];
const arr2=new Array();

// for(let i in arr1){
//     if(arr2.includes(arr1[i])){
//         continue;

//     }
//     else{
//         arr2.push(arr1[i]);
//     }
// }
// console.log(arr2);


let sum=0;
for(let j=0;j<arr1.length;j++){
    sum=sum+arr1[j];
}
let avg=sum/(arr1.length);
console.log(avg);