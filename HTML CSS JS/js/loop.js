console.log("while loop");
let sum=0;
while(true){
    let num=+ prompt("Enter any number");
    sum += num;
    const input = prompt ("Enter y to continue");
    if(input == 'y' || input =='Y')
        continue;
    else
    break;


}

console.log(`sum is ${sum}`);