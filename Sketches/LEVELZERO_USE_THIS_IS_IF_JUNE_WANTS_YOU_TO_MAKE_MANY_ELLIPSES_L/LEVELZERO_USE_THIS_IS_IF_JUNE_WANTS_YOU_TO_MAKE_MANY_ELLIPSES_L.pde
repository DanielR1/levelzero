size(1440,990);
for(int i =730 ; i>0; i--){

if(i%2==0){
 fill(255,0,0); 
}
else{
fill(255,255,255);
}
ellipse(720,395, i, i);  
i-=20;
}

