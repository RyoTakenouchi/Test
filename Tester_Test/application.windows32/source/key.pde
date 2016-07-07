//color change
void keyTyped(){
//A Move key
 if (key == 'a') {
   axt = mouseX;
   ayt = mouseY;
 }
 
//B Move key
  if (key == 'b') {
   bxt = mouseX;
   byt = mouseY;
 }

//C Move key 
 if (key == 'c') {
   cxt = mouseX;
   cyt = mouseY;
 }
 
//D Move key
  if (key == 'd') {
   dxt = mouseX;
   dyt = mouseY; 
 }  
  
//1 Move key 
  if(key == '1') {
   px1t = mouseX;
   py1t = mouseY;
 }
 
//2 Move key
 if (key == '2') {
   px2t = mouseX;
   py2t = mouseY; 
 }

//3 Move  key
  if (key == '3') {
   px3t = mouseX;
   py3t = mouseY; 
 }
 
//4 Move key
   if(key == '4') {
   px4t = mouseX;
   py4t = mouseY;
 }


//M Move key
 if (key == 'm') {
   mxt = mouseX;
   myt = mouseY;
 }

//X Move key
  if (key == 'x') {
   xxt = mouseX;
   xyt = mouseY;
 }

//Y Move key
 if (key == 'y') {
   yxt = mouseX;
   yyt = mouseY;
 }

//Z Move key
  if(key == 'z') {
   zxt = mouseX;
   zyt = mouseY;
 }
 
 //Ball Move key
  if (key == ' ') {
   ballxt = mouseX;
   ballyt = mouseY;
 }
  
//1,2 color
  if(key == '!'){
   z1 = z1+1;
 }
 
//3,4 color
 if(key == '#'){
   z2 = z2+1;
 }
 
 /* if(key == 't'){
   exit();
  }*/ 
 
  
  if(key == '0'){
    push = 0; push2 = 0;
  } 
 
// Line 
 if(key == '5'){
  Li = Li+1;
} 

// Elli 
 if(key == '6'){
  El = El+1;
} 
  
if(key == 's'){
 ss = false;
}

//reset  key
 if (key == 'l') {
   setP();
 }
 //reset El
 if (key == '7') {
   setEl();
 }
 
 if (key == '9'){
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
 /////////////////////////////////
}

void keyReleased(){
  if(key == 's'){
  num = num+1;
   saveFrame("ScreenShot/"+y+"/"+nf(m,2)+nf(d,2)+"/"+
   nf(h, 2)+""+ nf(min, 2)+"_"+nf(num,2)+".png");
   ss = true;
 }
 
 if(key == 'w' && push2 < 20){
  push2 += 1;
  wr();
 }
 
if(key == 'r' && push2 > push){
  push = push + 1 ;
  read();
  update();
 }
 
 if(key == 'e' && push > 0 ){
    push = push - 1; 
    read();
    update();
  }

}
