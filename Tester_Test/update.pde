void read(){
  if(push > 0 || push2 > 0 ){
  stuff = loadStrings("positions"+push+".txt");  
  
  data = new float[stuff.length][];
  for(int i=0; i<stuff.length;i++){
    data[i] = float(split(stuff[i],','));  //
   }
  }  
}


void update(){
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
