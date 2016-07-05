import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.io.File; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Tester_Test extends PApplet {

boolean ia = true; boolean ib = true;
boolean ic = true; boolean id = true;

boolean ix = true; boolean iy = true;
boolean iz = true;

boolean im = true; 

boolean i1 = true; boolean i2 = true;
boolean i3 = true; boolean i4 = true;

//1~8 color
float c1 = 100; float c2 = 0;
float c3 = 100; float c4 = 0;

//number SetPoint
float px1 = 200-40;  float py1 = 30+15;
float px2 = 650-40;  float py2 = 30+15;   
float px3 = 720-50;  float py3 = 30+15;
float px4 = 1180-70; float py4 = 30+15;

//number VPoint
float px1t = 200-40;  float py1t = 30+15;
float px2t = 650-40;  float py2t = 30+15;
float px3t = 720-50;  float py3t = 30+15;
float px4t = 1180-70; float py4t = 30+15;

float r = 40;

//A,B,C,D SetPoint
float dx = 150-70;  float ay = 450;
float cx = 600-50;  float by = 250;
float bx = 750-40;  float cy = 430;
float ax = 1240-70; float dy = 220;

//A,B,C,D VPoint
float dxt = 150-70;  float ayt = 450;
float cxt = 600-50;  float byt = 250;
float bxt = 750-40;  float cyt = 430;
float axt = 1240-70; float dyt = 220;

//M,N,O SetPoint
float mx = 270;        float my = 630;//+30;

//M.N.O VPoint
//float mxt = 270;  float myt = 630+30;
float mxt = 270;  float myt = 630;

//X,Y,Z SetPoint
float xx = 380;     float xy = 580+30;
float yx = 1280/2;  float yy = 580+30;
float zx = 900;     float zy = 580+30;

//X,Y,Z VPoint
float xxt = 380;    float xyt = 580+30;
float yxt = 1280/2; float yyt = 580+30;
float zxt = 900;    float zyt = 580+30;

// color box
float z1 = 0; float z2 = 0;

float ex1 = -100; float ey1 = -100;
float ex2 = -100; float ey2 = -100;
float ex3 = -100; float ey3 = -100;
float ex4 = -100; float ey4 = -100;
float ex5 = -100; float ey5 = -100;
float ex6 = -100; float ey6 = -100;
float ex7 = -100; float ey7 = -100;
float ex8 = -100; float ey8 = -100;
float ex9 = -100; float ey9 = -100;
float ex10 = -100; float ey10 = -100;

float j = 0;  float w = 0;
float Li = 0; float El = 0;
float j2 = j; float w2 = w;

boolean ss = true;
int num = 0;
int y = year(); int m = month();
int d = day();  int h = hour();
int min = minute();

String ball = "On";
String line = "On";

float E = 0;
float L = 0;

PrintWriter output;
int push = 0; int push2 = 0; int push3 = 0; 
float [][]data;
String[] stuff;
int to = 0;
boolean Tx = true;

boolean B1 = true;

float ballx = 640-256; float bally = 60+20;
float ballxt = 640-256; float ballyt = 60+20;



File f = new File("positions"+1+".txt");

//reset
public void setP(){
dx = 150-70;  ay = 450;
cx = 600-50;  by = 250;
bx = 750-40;  cy = 430;
ax = 1240-70; dy = 220;

px1 = 200-40;  py1 = 30+15;
px2 = 650-40;  py2 = 30+15;
px3 = 720-50;  py3 = 30+15;
px4 = 1180-70; py4 = 30+15;

 
dxt = 150-70;  ayt = 450;
cxt = 600-50;  byt = 250;
bxt = 750-40;  cyt = 430;
axt = 1240-70; dyt = 220;


px1t = 200-40;  py1t = 30+15;
px2t = 650-40;  py2t = 30+15;
px3t = 720-50;  py3t = 30+15;
px4t = 1180-70; py4t = 30+15;


mx = 270;   my = 630;//+30;

mxt = 270;  myt = 630;//+30;

xx = 380;      xy = 580+30;
yx = width/2;  yy = 580+30;
zx = 900;      zy = 580+30;

xxt = 380;     xyt = 580+30;
yxt = width/2; yyt = 580+30;
zxt = 900;     zyt = 580+30;

z1 = 0;  z2 = 0;

ex1 = -100; ey1 = -100;
ex2 = -100; ey2 = -100;
ex3 = -100; ey3 = -100;
ex4 = -100; ey4 = -100;
ex5 = -100; ey5 = -100;
ex6 = -100; ey6 = -100;
ex7 = -100; ey7 = -100;
ex8 = -100; ey8 = -100;
ex9 = -100; ey9 = -100;
ex10 = -100;  ey10 = -100;

j = 0; w = 0;


ballx = width/2-256;  bally = 60+20;
ballxt = width/2-256; ballyt = 60+20;
}

public void setEl(){
ex1 = -100; ey1 = -100;
ex2 = -100; ey2 = -100;
ex3 = -100; ey3 = -100;
ex4 = -100; ey4 = -100;
ex5 = -100; ey5 = -100;
ex6 = -100; ey6 = -100;
ex7 = -100; ey7 = -100;
ex8 = -100; ey8 = -100;
ex9 = -100; ey9 = -100;
ex10 = -100;  ey10 = -100;

j = 0; w = 0;

}

   public void mouseDragged(){ 
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
//color change
public void keyTyped(){
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

public void keyReleased(){
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
public void mouseClicked(){
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

public void mousePressed(){
//SS
  if((5 < mouseX && mouseX <75)&&
     (720 < mouseY && mouseY < 790)){
      ss = false;
    }
}


public void mouseReleased() {
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
public void setup(){ 
 size(1280,800);
 //size(displayWidth,displayHeight);
  smooth();
  wr(); 
}

public void draw(){
 background(0,235,0);
 strokeWeight(0);
 noStroke();
 frameRate(120);
 
// new File("//positions"+push2+".txt"); 
 /*
 fill(255,0,0);
 rect(width/2-256-220,120,110,440);
 fill(255,180,0);
 rect(width/2-256-110,120,210,440);
*/

//triangle X,Y Z
fill(250,150,0);
triangle(xx,xy,yx,yy,zx,zy); 
 
//X Move 
  xx = xx+(xxt-xx)*0.05f;
  xy = xy+(xyt-xy)*0.05f;
  if(dist(xx,xy,xxt,xyt) < 2){
    xx = xxt;
    xy = xyt;
  }

//Y Move 
  yx = yx+(yxt-yx)*0.05f;
  yy = yy+(yyt-yy)*0.05f;
  if(dist(yx,yy,yxt,yyt) < 2){
    yx = yxt;
    yy = yyt;
  }

//Z Move 
  zx = zx+(zxt-zx)*0.05f;
  zy = zy+(zyt-zy)*0.05f;
  if(dist(zx,zy,zxt,zyt) < 2){
    zx = zxt;
    zy = zyt;
  }    
  
// M,N,O
// fill(250,0,250,150);
// quad (mx,my,nx,ny,ox,oy,px,py);  
//M Move 
  mx = mx+(mxt-mx)*0.05f;
  my = my+(myt-my)*0.05f;
  if(dist(mx,my,mxt,myt) < 2){
    mx = mxt;
    my = myt;
  }
    
///coat/////////////////////////////////////////////////
  strokeWeight(5);
  stroke(255);
 //Net
 line(width/2,100+20,width/2,540+20);
 
 //side
 line(width/2,100+20,width/2-256,100+20);
 line(width/2,100+20,width/2+256,100+20);
 line(width/2,540+20,width/2-256,540+20);
 line(width/2,540+20,width/2+256,540+20);
 
 line(width/2-256,100+20,width/2-256-220,100+20);
 line(width/2+256,100+20,width/2+256+220,100+20);
 line(width/2-256,540+20,width/2-256-220,540+20);
 line(width/2+256,540+20,width/2+256+220,540+20);
 
 //Base
 line(width/2-256-220,100+20,width/2-256-220,540+20);
 line(width/2+256+220,100+20,width/2+256+220,540+20);
 
 //single
 line(width/2-256-220,100+54+20,width/2+256+220,100+54+20);
 line(width/2-256-220,540-54+20,width/2+256+220,540-54+20);
 
 //serve
 line(width/2-256,100+54+20,width/2-256,540-54+20);
 line(width/2-256,100+54+20,width/2-256,540-54+20);
 line(width/2+256,100+54+20,width/2+256,540-54+20);
 line(width/2+256,100+54+20,width/2+256,540-54+20);
 line(width/2-256,(100+540)/2+20,width/2+256,(100+540)/2+20);
 
 line(width/2-256-220,640/2+20,width/2-256-220+10,640/2+20);
 line(width/2+256+220,640/2+20,width/2+256+220-10,640/2+20);
 /////////////////////////////////////////////  

strokeWeight(0);
textSize(25); 
//XYZ
 fill(250,150,0);
 ellipse(xx,xy,r-10,r-10);
 //fill(255);    
 //text("X ",xx-10,xy+10);
 fill(250,150,0);
 ellipse(yx,yy,r-10,r-10);
 //fill(255);    
 //text("Y ",yx-10,yy+10);
 fill(250,150,0);
 ellipse(zx,zy,r-10,r-10);
 //fill(255);    
 //text("Z ",zx-10,zy+10);

//MNOP
  fill(250,0,250,200);
  ellipse(mx,my,(r*2)+15,(r*2)+15);
 
//1,2 Move   
  strokeWeight(5);
  stroke(0,c1,c2);
  fill(0,c1,c2);
  line(px1,py1,px2,py2);
  ellipse(px1,py1,20,20);
  ellipse(px2,py2,20,20);
  px1 = px1+(px1t-px1)*0.05f;
  py1 = py1+(py1t-py1)*0.05f;
  if(dist(px1,py1,px1t,py1t) < 2){
    px1 = px1t;
    py1 = py1t;
  }
  px2 = px2+(px2t-px2)*0.05f;
  py2 = py2+(py2t-py2)*0.05f;
  if(dist(px2,py2,px2t,py2t) < 2){
    px2 = px2t;
    py2 = py2t;   
  }
 textSize(20);
 fill(255);
 //text("1",px1-8,py1+7);
 //text("2",px2-8,py2+7);

//3,4 Move       
  stroke(0,c3,c4);
  fill(0,c3,c4);
  line(px3,py3,px4,py4);
  ellipse(px3,py3,20,20);
  ellipse(px4,py4,20,20);
  px3 = px3+(px3t-px3)*0.05f;
  py3 = py3+(py3t-py3)*0.05f;
  if(dist(px3,py3,px3t,py3t) < 2){
    px3 = px3t;
    py3 = py3t;
  }
  px4 = px4+(px4t-px4)*0.05f;
  py4 = py4+(py4t-py4)*0.05f;
  if(dist(px4,py4,px4t,py4t) < 2){
    px4 = px4t;
    py4 = py4t;
  }
 textSize(20);
 fill(255);
 //text("3",px3-8,py3+7);
 //text("4",px4-8,py4+7);

   
/////////////////////////////////
  
  //stroke(0);
  //Straight Line , Cross Line 
  //line(200,580,2377/2,580);
  //line(200,600,1273,600);    
 
///////////////////////////////// 

//Button
if(ss == true){
stroke(0);
strokeWeight(2);

//end
fill(255,0,0);
rect(width-40,0,40,25);

stroke(0);
strokeWeight(5);
// ALL reset
fill(150);
rect(1150,720,120,70);
//Ball reset
fill(150);
rect(1050,720,80,70);
//Ball ON or Off
fill(250,0,0);
rect(950,720,80,70);
//Line On or Off
fill(0,180,255);
rect(850,720,80,70);
//Ball Back
fill(230,160,235);
rect(750,720,80,70);
//1,2
fill(0,c1,c2);
rect(100,720,70,70);
//3,4
fill(0,c3,c4);
rect(190,720,70,70);
//Screen Shot
fill(0,0,255);
rect(5,720,75,70);

//text save
fill(0,180,255);
rect(550,720,70,70);
//text reset 
fill(180);
rect(650,720,70,70);
//text load
fill(255,0,0);
triangle(280,755,350,790,350,720);
triangle(460,790,460,720,530,755);

fill(255);
rect(360,720,90,70);

textSize(28);
fill(255);
text("Reset",1175,775);
text("ALL",1185,750);
textSize(23);
text("Ball",1070,750);
text("Reset",1060,780);
text("Ball",970,750); 
text(ball,970,780);
text("Line",870,750);
text(line,875,780);
text("Ball",770,750);
text("Return",753,780);
text("Save",660,750);
text("Reset",655,780);
//end
text("\u00d7",width-30,20);


fill(0);
text("Load",380,745);
textSize(22);
text(push,370,775);
text("/ ",400,775);
text(push2,410,775);


textSize(28);
fill(255);
text("1,2",110,765);
text("3,4",200,765);
text("Save",555,760);

textSize(20);
text("Screen",12,750);
text("Shot",20,770);

textSize(50);
text("-",310,770);
textSize(42);
text("+",465,765);

}
 
 //1,2 color change
 if(z1 % 2 == 0){
  c1 = 100;
  c2 = 0;
 } else{
   c1 = 200;
   c2 = 200;
 }
 
//3,4 color change
  if(z2 % 2 == 0){
  c3 = 100;
  c4 = 0;
 } else{
   c3 = 200;
   c4 = 200;
 }

 
fill(255,255,0);
boolean Elli = true;
boolean Line = true;

if(El % 2 == 0){
  Elli = false;
  ball = "Off";
  E = 0; 
  }else{
  Elli = true;
  E = 1;
  ball = "On";
}

if(Li % 2 == 0){
  Line = false;
  line = "Off";
}else{
  Line = true;
  line = "On";
}

 strokeWeight(5);
 if(Line == true){
 if(ex2>0){ stroke(255,255,0); line(ex1,ey1,ex2,ey2);}
 if(ex3>0){ stroke(255,255,0); line(ex2,ey2,ex3,ey3);}
 if(ex4>0){ stroke(255,255,0); line(ex3,ey3,ex4,ey4);}
 if(ex5>0){ stroke(255,255,0); line(ex4,ey4,ex5,ey5);}
 if(ex6>0){ stroke(255,255,0); line(ex5,ey5,ex6,ey6);}
 if(ex7>0){ stroke(255,255,0); line(ex6,ey6,ex7,ey7);}
 if(ex8>0){ stroke(255,255,0); line(ex7,ey7,ex8,ey8);}
 if(ex9>0){ stroke(255,255,0); line(ex8,ey8,ex9,ey9);}
 if(ex10>0){ stroke(255,255,0); line(ex9,ey9,ex10,ey10);}
 }
 
 //Click Ball  
 noStroke();
 fill(255,255,0);
 ellipse(ex1,ey1,20,20);
 ellipse(ex2,ey2,20,20);
 ellipse(ex3,ey3,20,20);
 ellipse(ex4,ey4,20,20);
 ellipse(ex5,ey5,20,20);
 ellipse(ex6,ey6,20,20);
 ellipse(ex7,ey7,20,20);
 ellipse(ex8,ey8,20,20);
 ellipse(ex9,ey9,20,20);
 ellipse(ex10,ey10,20,20);
 
 fill(0);
 textSize(20);
 text("1",ex1-7,ey1+7);
 text("2",ex2-7,ey2+7);
 text("3",ex3-7,ey3+7);
 text("4",ex4-7,ey4+7);
 text("5",ex5-7,ey5+7);
 text("6",ex6-7,ey6+7);
 text("7",ex7-7,ey7+7);
 text("8",ex8-7,ey8+7);
 text("9",ex9-7,ey9+7);
 textSize(17);
 text("10",ex10-9,ey10+7);
 
if(w == -1){
  setEl();
}

//A Move 
 strokeWeight(0);
 fill(0,0,255);
 ellipse(ax,ay,r,r);
  ax = ax+(axt-ax)*0.05f;
  ay = ay+(ayt-ay)*0.05f;
  if(dist(ax,ay,axt,ayt) < 2){
    ax = axt;
    ay = ayt;
  }
fill(255);
textSize(30);

pushMatrix();
translate(ax,ay);
rotate(-HALF_PI);
translate(-ax,-ay);
text("A ",ax-10,ay+10);
popMatrix();
  
//B Move 
  fill(255,0,0);
  ellipse(bx,by,r,r);
  bx = bx+(bxt-bx)*0.05f;
  by = by+(byt-by)*0.05f;
  if(dist(bx,by,bxt,byt) < 2){
    bx = bxt;
    by = byt;
  }
fill(255);
textSize(30);

pushMatrix();
translate(bx,by);
rotate(-HALF_PI);
translate(-bx,-by);
text("B ",bx-10,by+10);
popMatrix();

//C Move 
  fill(255,0,0);
  ellipse(cx,cy,r,r);
  cx = cx+(cxt-cx)*0.05f;
  cy = cy+(cyt-cy)*0.05f;
  if(dist(cx,cy,cxt,cyt) < 2){
    cx = cxt;
    cy = cyt;
  }
fill(255);
textSize(30);
  
pushMatrix();
translate(cx,cy);
rotate(-HALF_PI);
translate(-cx,-cy);
text("C ",cx-10,cy+10);
popMatrix();
  
//D Move 
  fill(0,0,255);
  ellipse(dx,dy,r,r);
  dx = dx+(dxt-dx)*0.05f;
  dy = dy+(dyt-dy)*0.05f;
  if(dist(dx,dy,dxt,dyt) < 2){
    dx = dxt;
    dy = dyt;
  }
fill(255);
textSize(30);

pushMatrix();
translate(dx,dy);
rotate(-HALF_PI);
translate(-dx,-dy);
text("D ",dx-10,dy+10);
popMatrix();

//Ball Move 
  fill(250,250,0);
  ellipse(ballx,bally,r-10,r-10);
  ballx = ballx+(ballxt-ballx)*0.05f;
  bally = bally+(ballyt-bally)*0.05f;
  if(dist(ballx,bally,ballxt,ballyt) < 2){
    ballx = ballxt;
    bally = ballyt;
  }
}
////////////////////////////////////////////////////////

 

public void read(){
  if(push > 0 || push2 > 0 ){
  stuff = loadStrings("positions"+push+".txt");  
  
  data = new float[stuff.length][];
  for(int i=0; i<stuff.length;i++){
    data[i] = PApplet.parseFloat(split(stuff[i],','));  //
   }
  }  
}


public void update(){
  for (int i = 0; i < data.length; i++) {  
    for (int j = 0; j < data[i].length; j++) {
      
      axt = data[0][0];  ayt = data[0][1];
      bxt = data[1][0];  byt = data[1][1];
      cxt = data[2][0];  cyt = data[2][1];
      dxt = data[3][0];  dyt = data[3][1];
   
      xxt = data[4][0];  xyt = data[4][1];
      yxt = data[5][0];  yyt = data[5][1];
      zxt = data[6][0];  zyt = data[6][1];
   
      mxt = data[7][0];  myt = data[7][1];
     
      
      px1t = data[8][0]; py1t = data[8][1];
      px2t = data[9][0]; py2t = data[9][1];
      px3t = data[10][0]; py3t = data[10][1];
      px4t = data[11][0]; py4t = data[11][1];
      
      El   = data[12][0]; Li   = data[12][1];
       
      ex1  = data[13][0]; ey1  = data[13][1];
      ex2  = data[14][0]; ey2  = data[14][1];
      ex3  = data[15][0]; ey3  = data[15][1];
      ex4  = data[16][0]; ey4  = data[16][1];
      ex5  = data[17][0]; ey5  = data[17][1];
      ex6  = data[18][0]; ey6  = data[18][1];
      ex7  = data[19][0]; ey7  = data[19][1];
      ex8  = data[20][0]; ey8  = data[20][1];
      ex9  = data[21][0]; ey9  = data[21][1];
      ex10 = data[22][0]; ey10 = data[22][1];
      
      ballxt = data[23][0]; ballyt = data[23][1];
      
      z1 = data[24][0]; z2 = data[24][1];
    
    }
   }
}
public void wr(){
  output = createWriter("positions"+push2+".txt");
  
   output.print(axt+" , ");
   output.println(ayt);
   output.print(bxt+" , ");
   output.println(byt);
   output.print(cxt+" , ");
   output.println(cyt);
   output.print(dxt+" , ");
   output.println(dyt);
   
   output.print(xxt+" , ");
   output.println(xyt);
   output.print(yxt+" , ");
   output.println(yyt);
   output.print(zxt+" , ");
   output.println(zyt);
   
   output.print(mxt+" , ");
   output.println(myt);
   
   output.print(px1t+" , ");
   output.println(py1t);
   output.print(px2t+" , ");
   output.println(py2t);
   output.print(px3t+" , ");
   output.println(py3t);
   output.print(px4t+" , ");
   output.println(py4t);
   
   output.print(El+" , ");
   output.println(Li);
   
   output.print(ex1+" , ");
   output.println(ey1);
   output.print(ex2+" , ");
   output.println(ey2);
   output.print(ex3+" , ");
   output.println(ey3);
   output.print(ex4+" , ");
   output.println(ey4);
   output.print(ex5+" , ");
   output.println(ey5);
   output.print(ex6+" , ");
   output.println(ey6);
   output.print(ex7+" , ");
   output.println(ey7);
   output.print(ex8+" , ");
   output.println(ey8);
   output.print(ex9+" , ");
   output.println(ey9);
   output.print(ex10+" , ");
   output.println(ey10);
   
   output.print(ballxt+" , ");
   output.println(ballyt);
   
   output.print(z1+" , ");
   output.println(z2);
      
   output.close();
 
   
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--hide-stop", "Tester_Test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
