
const withdraw=document.createElement("button");
const deposit=document.createElement("button");
const balance=document.createElement("button");
const help=document.createElement("button");
const d1=document.getElementsByTagName("body")
function fun(){
	withdraw.value="withdraw";
deposit.value="deposit";
balance.value="balance";
help.value="balance";
d1.append(withdraw,deposit,balance,help)
}
fun();
let form=document.getElementById("form");
let input=document.createElement("input");
let amount=document.getElementById("amount");
input.type="text";
input.placeholder="Enter the Amount";


/*withdraw.addEventListener('click',()=>{
	let value1=window.prompt("amount");
	if(value1>0){
	amount.value=value1;
	console.log(value1);
	form.submit();
	}
});
deposit.addEventListener("click",()=>{
	let value2=window.prompt("amount",input);
	amount.value=value2;
	form.submit();
})
balance.addEventListener("click",()=>{})
help.addEventListener("click",()=>{
   form.action="www.google.com";
   form.submit();
})*/