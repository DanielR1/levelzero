void setup(){
  size(800,800);
  background(255,255,255);
  
}
int Xone = 100;
  int Xtwo = 700;
  
void draw(){
  background(255,255,255);
  noFill();
  for(int i = 400; i>00;i--){
//    fill(0,0,0);
     ellipse(Xone,400,i,i);
     i-=3;
    
//     fill(255,255,255);
     ellipse(Xone,400,i,i);
     i-=6;
    

  }
  Xone +=1;
   for(int i = 400; i>00;i--){
//    fill(0,0,0);
     ellipse(Xtwo,400,i,i);
     i-=3;
    
//     fill(255,255,255);
     ellipse(Xtwo,400,i,i);
     i-=6;
    

  }
  Xtwo -=1;
}
