   void mouseDragged(){ 
  // A Move 
  if((axt-r+10 < mouseX && mouseX < axt+r-10) &&
     (ayt-r+10 < mouseY && mouseY < ayt+r-10) && (ia)){
   axt = mouseX; 
   ayt = mouseY;
   ib = false;   ic = false;
   id = false;

   ix = false;   iy = false;
   iz = false;
   
   im = false;   
   
   i1 = false;   i2 = false;
   i3 = false;   i4 = false;
   
   B1 = false;
 }
// B Move
  if((bxt-r+10 < mouseX && mouseX < bxt+r-10) &&
     (byt-r+10 < mouseY && mouseY < byt+r-10)&& (ib)){
   bxt = mouseX; 
   byt = mouseY;
   ia = false;   ic = false;
   id = false;

   ix = false;   iy = false;
   iz = false;
   
   im = false;   
   
   i1 = false;   i2 = false;
   i3 = false;   i4 = false;
   
   B1 = false;
  }
 // C Move  
  if((cxt-r+10 < mouseX && mouseX < cxt+r-10) &&
     (cyt-r+10 < mouseY && mouseY < cyt+r-10)&& (ic)){
   cxt = mouseX; 
   cyt = mouseY;
   ia = false;   ib = false;
   id = false;

   ix = false;   iy = false;
   iz = false;
   
   im = false;   
   
   i1 = false;   i2 = false;
   i3 = false;   i4 = false;
   
   B1 = false;
  }
 // D Move
  if((dxt-r+10 < mouseX && mouseX < dxt+r-10) &&
     (dyt-r+10 < mouseY && mouseY < dyt+r-10)&& (id)){
   dxt = mouseX; 
   dyt = mouseY;
   ia = false;   ib = false;
   ic = false;

   ix = false;   iy = false;
   iz = false;
   
   im = false;  
   
   i1 = false;   i2 = false;
   i3 = false;   i4 = false;
   
   B1 = false;   
   }
   
 // M Move
  if((mxt-r < mouseX && mouseX < mxt+r) &&
     (myt-r < mouseY && mouseY < myt+r)&& (im)){
   mxt = mouseX; 
   myt = mouseY;
   ia = false;   ib = false;
   ic = false;   id = false;

   ix = false;   iy = false;
   iz = false;
   
   
   i1 = false;   i2 = false;
   i3 = false;   i4 = false;
   
   B1 = false;
  } 

 // X Move
  if((xxt-r+10 < mouseX && mouseX < xxt+r-10) &&
     (xyt-r+10 < mouseY && mouseY < xyt+r-10)&& (ix)){
   xxt = mouseX; 
   xyt = mouseY;
   ia = false;   ib = false;
   ic = false;   id = false;

   iy = false;   iz = false;
   
   im = false;   
   
   i1 = false;   i2 = false;
   i3 = false;   i4 = false;
   
   B1 = false;
   } 
 // Y Move 
  if((yxt-r+10 < mouseX && mouseX < yxt+r-10) &&
     (yyt-r+10 < mouseY && mouseY < yyt+r-10)&& (iy)){
   yxt = mouseX; 
   yyt = mouseY;
   ia = false;   ib = false;
   ic = false;   id = false;

   ix = false;   iz = false;
   
   im = false;   
   
   i1 = false;   i2 = false;
   i3 = false;   i4 = false;
   
   B1 = false;
   } 
 // Z Move
  if((zxt-r+10 < mouseX && mouseX < zxt+r-10) &&
     (zyt-r+10 < mouseY && mouseY < zyt+r-10)&& (iz)){
   zxt = mouseX; 
   zyt = mouseY;
   ia = false;   ib = false;
   ic = false;   id = false;

   ix = false;   iy = false;
   
   im = false;   
   
   i1 = false;   i2 = false;
   i3 = false;   i4 = false;
   
   B1 = false;
   }
  
 // 1 Move
  if((px1t-20 < mouseX && mouseX < px1t+20) &&
     (py1t-20 < mouseY && mouseY < py1t+20)&& (i1)){
   px1t = mouseX; 
   py1t = mouseY;
   ia = false;   ib = false;
   ic = false;   id = false;

   ix = false;   iy = false;
   iz = false;
   
   im = false;   
   
   i2 = false;   i3 = false;
   i4 = false;   B1 = false;
   }
 // 2 Move
  if((px2t-20 < mouseX && mouseX < px2t+20) &&
     (py2t-20 < mouseY && mouseY < py2t+20)&& (i2)){
   px2t = mouseX; 
   py2t = mouseY;
   ia = false;   ib = false;
   ic = false;   id = false;

   ix = false;   iy = false;
   iz = false;
   
   im = false;   
   
   i1 = false;   i3 = false;
   i4 = false;      B1 = false;
  }
  
 // 3 Move
  if((px3t-20 < mouseX && mouseX < px3t+20) &&
     (py3t-20 < mouseY && mouseY < py3t+20)&& (i3)){
   px3t = mouseX; 
   py3t = mouseY;
   ia = false;   ib = false;
   ic = false;   id = false;

   ix = false;   iy = false;
   iz = false;
   
   im = false;   
   
   i1 = false;   i2 = false;
   i4 = false;   B1 = false;
  }
 // 4 Move
  if((px4t-20 < mouseX && mouseX < px4t+20) &&
     (py4t-20 < mouseY && mouseY < py4t+20)&& (i4)){
   px4t = mouseX; 
   py4t = mouseY;
   ia = false;   ib = false;
   ic = false;   id = false;

   ix = false;   iy = false;
   iz = false;
   
   im = false; 
   
   i1 = false;   i2 = false;
   i3 = false;   B1 = false;
  } 
 //Ball
 if((ballxt-20 < mouseX && mouseX < ballxt+20) &&
    (ballyt-20 < mouseY && mouseY < ballyt+20) && (B1)){
   ballxt = mouseX; 
   ballyt = mouseY;
   ia = false;   ib = false;
   ic = false;   id = false;

   ix = false;   iy = false;
   iz = false;
   
   im = false;   
   
   i1 = false;   i2 = false;
   i3 = false;   i4 = false;
   
 }
}
