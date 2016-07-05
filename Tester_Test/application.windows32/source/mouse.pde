void mouseClicked(){
  //Ball
  if(mouseY < 630 && E == 1 && j < 10){
    j+=1;
    
  if(j==1 && w >= 0){
  ex1 = mouseX; ey1 = mouseY;
  w = 1;
  }
  if(j==2 && w >= 1){
  ex2 = mouseX; ey2 = mouseY;
  w = 2;
  }
  if(j==3 && w >= 2){
  ex3 = mouseX; ey3 = mouseY;
  w = 3;
  }
  if(j==4 && w == 3){
  ex4 = mouseX; ey4 = mouseY;
  w = 4;
  }
  if(j==5 && w == 4){
  ex5 = mouseX; ey5 = mouseY;
  w = 5;
  }
  if(j==6 && w == 5){
  ex6 = mouseX; ey6 = mouseY;
  w = 6;
  }
  if(j==7 && w == 6){
  ex7 = mouseX; ey7 = mouseY;
  w = 7;
  }
  if(j==8 && w == 7){
  ex8 = mouseX; ey8 = mouseY;
  w = 8;
  }
  if(j==9 && w == 8){
  ex9 = mouseX; ey9 = mouseY;
  w = 9;
  }
  if(j==10 && w == 9){
  ex10 = mouseX; ey10 = mouseY;
  w = 10;
  }
 }
  
  //reset  
  if((1150 < mouseX && mouseX < 1270) && 
     (720 < mouseY && mouseY < 790)){
       setP();
  }  
  
 // 1,2
  if((100 < mouseX && mouseX < 170) &&
     (720 < mouseY && mouseY < 790)){
      z1 = z1+1;
      if(z1 == 10){
        z1 = 0;
      }
  }
  // 3,4
  if((190 < mouseX && mouseX < 260 ) &&
     (720 < mouseY && mouseY < 790)){
      z2 = z2+1;
      if(z2 == 10){
        z2 = 0;
      }
  }
 
  //ball reset
  if((1050 < mouseX && mouseX < 1130) && 
     (720 < mouseY && mouseY < 790)){
       setEl();
  }
  
  //ball On or Off 
  if((950 < mouseX && mouseX < 1030) && 
     (720 < mouseY && mouseY < 790)){
       El = El + 1;
        if(El == 10){
           El = 0;
       }
  }
  //Line On or Off
  if((850 < mouseX && mouseX < 930) && 
     (720 < mouseY && mouseY < 790)){
       Li = Li + 1;
        if(Li == 10){
           Li = 0;
       }
     }
   
  //ball back
  if((750 < mouseX && mouseX < 830) && 
     (720 < mouseY && mouseY < 790)){
       w = w - 1;
       j = j - 1;
       if(j < 1){ ex1 = -100; }
       if(j < 2){ ex2 = -100; }
       if(j < 3){ ex3 = -100; }
       if(j < 4){ ex4 = -100; }
       if(j < 5){ ex5 = -100; }
       if(j < 6){ ex6 = -100; }
       if(j < 7){ ex7 = -100; }
       if(j < 8){ ex8 = -100; }
       if(j < 9){ ex9 = -100; }
       if(j < 10){ ex10 = -100; }
  }
  //save reset
  if((650 < mouseX && mouseX < 720) && 
     (720 < mouseY && mouseY < 790)){
       push = 0; push2 = 0;
  }
  //save
  if((550 < mouseX && mouseX < 620) && 
     (720 < mouseY && mouseY < 790) && push2 < 20){
       push2 += 1;
       wr();
  }
  //load -
  if((280 < mouseX && mouseX < 350) && 
     (720 < mouseY && mouseY < 790) &&
      (push > 0)){
       push = push - 1; 
       read();
       update();
  }
  //load +
  if((460 < mouseX && mouseX < 530) && 
     (720 < mouseY && mouseY < 790) &&
     (push2 > push)){
       push = push + 1; 
       read();
       update();
  }
 //end  
  if((width-40 < mouseX && mouseX < width) &&
     (0 < mouseY && mouseY < 25)){
      exit();
     }    
 }  

void mousePressed(){
//SS
  if((5 < mouseX && mouseX <75)&&
     (720 < mouseY && mouseY < 790)){
      ss = false;
    }
}


void mouseReleased() {
   ia = true;   ib = true;
   ic = true;   id = true;

   ix = true;   iy = true;
   iz = true;
   
   im = true;  
   
   i1 = true;   i2 = true;
   i3 = true;   i4 = true;
   
   B1 = true;
   
  if((5 < mouseX && mouseX <75)&&
     (720 < mouseY && mouseY < 790)){
      num = num+1;
   saveFrame("ScreenShot/"+y+"/"+nf(m,2)+nf(d,2)+"/"+
             nf(h, 2)+""+ nf(min, 2)+"_"+nf(num,2)+".png");
      ss = true;
     }   
}
