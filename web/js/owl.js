$(document).ready(function() {
 
  $("#owl-demo").owlCarousel({
 
      autoPlay: 2000, //Set AutoPlay to 3 seconds
 
      items : 4,
      itemsDesktop : [1199,6],
      itemsDesktopSmall : [979,3],
	  ransitionStyle : "fade",
	   stopOnHover : true
	  
  });
 
});
var win=null;
function NewWindow(mypage,myname,w,h,scroll,pos){
if(pos=="random"){LeftPosition=(screen.width)?Math.floor(Math.random()*(screen.width-w)):100;TopPosition=(screen.height)?Math.floor(Math.random()*((screen.height-h)-75)):100;}
if(pos=="center"){LeftPosition=(screen.width)?(screen.width-w)/2:100;TopPosition=(screen.height)?(screen.height-h)/2:100;}
else if((pos!="center" && pos!="random") || pos==null){LeftPosition=0;TopPosition=20}
settings='width='+w+',height='+h+',top='+TopPosition+',left='+LeftPosition+',scrollbars='+scroll+',location=yes,directories=yes,status=yes,menubar=yes,toolbar=yes,resizable=yes';
win=window.open(mypage,myname,settings);}



	var myfont_face = "Arial";
	var myfont_size = "9";
	var myfont_color = "#ffffcc";
	var myback_color = "#000066";
	var mywidth = 80;
	var my12_hour = 1;

	var dn = ""; var old = "";

	if (document.all||document.getElementById) { document.write('<span id="LiveClockIE" style="width:'+mywidth+'px;  padding-top: 10px;  padding-bottom: 10px; background-color:'+myback_color+'"></span>'); }
	else if (document.layers) { document.write('<ilayer bgColor="'+myback_color+'" id="ClockPosNS"><layer width="'+mywidth+'" id="LiveClockNS"></layer></ilayer>'); }
	else { old = "true"; show_clock(); }

	function show_clock() {

		//show clock in NS 4
		if (document.layers)
                document.ClockPosNS.visibility="show"
		if (old == "die") { return; }

		var Digital = new Date();
		var hours = Digital.getHours();
		var minutes = Digital.getMinutes();
		var seconds = Digital.getSeconds();

		if (my12_hour) {
			dn = "AM";
			if (hours > 12) { dn = "PM"; hours = hours - 12; }
			if (hours == 0) { hours = 12; }
		} else {
			dn = "";
		}
		if (minutes <= 9) { minutes = "0"+minutes; }
		if (seconds <= 9) { seconds = "0"+seconds; }

		myclock = 'Time:<style="font-size:'+86+'pt;color:'+myfont_color+';>';
		myclock += '<font style="color:'+myfont_color+'; font-family:'+myfont_face+'; font-size:'+16+'pt;">';
		myclock += hours+':'+minutes+':'+seconds+' '+dn;
		myclock += '</font>';

		if (old == "true") {
			document.write(myclock);
			old = "die"; return;
		}

		if (document.layers) {
			clockpos = document.ClockPosNS;
			liveclock = clockpos.document.LiveClockNS;
			liveclock.document.write(myclock);
			liveclock.document.close();
		} else if (document.all) {
			LiveClockIE.innerHTML = myclock;
		} else if (document.getElementById) {
			document.getElementById("LiveClockIE").innerHTML = myclock;
		}

		setTimeout("show_clock()",1000);
}



//Autumn leaves- by Kurt Grigg (kurt.grigg@virgin.net)
//Modified by Dynamic Drive for NS6 functionality
//visit http://www.dynamicdrive.com for this script

//Pre-load your image below!
grphcs=new Array(6)
Image0=new Image();
Image0.src=grphcs[0]="img/dl.gif";
Image1=new Image();
Image1.src=grphcs[1]="img/dl.gif"
Image2=new Image();
Image2.src=grphcs[2]="img/cl.gif"
Image3=new Image();
Image3.src=grphcs[3]="img/dl.gif"
Image4=new Image();
Image4.src=grphcs[4]="img/el.gif"
Image5=new Image();
Image5.src=grphcs[5]="img/fl.gif" 

Amount=8; //Smoothness depends on image file size, the smaller the size the more you can use!
Ypos=new Array();
Xpos=new Array();
Speed=new Array();
Step=new Array();
Cstep=new Array();
ns=(document.layers)?1:0;
ns6=(document.getElementById&&!document.all)?1:0;

if (ns){
for (i = 0; i < Amount; i++){
var P=Math.floor(Math.random()*grphcs.length);
rndPic=grphcs[P];
document.write("<LAYER NAME='sn"+i+"' LEFT=0 TOP=0><img src="+rndPic+"></LAYER>");
}
}
else{
document.write('<div style="position:absolute;top:0px;left:0px"><div style="position:relative">');
for (i = 0; i < Amount; i++){
var P=Math.floor(Math.random()*grphcs.length);
rndPic=grphcs[P];
document.write('<img id="si'+i+'" src="'+rndPic+'" style="position:absolute;top:0px;left:0px">');
}
document.write('</div></div>');
}
WinHeight=(ns||ns6)?window.innerHeight:window.document.body.clientHeight;
WinWidth=(ns||ns6)?window.innerWidth-70:window.document.body.clientWidth;
for (i=0; i < Amount; i++){                                                                
 Ypos[i] = Math.round(Math.random()*WinHeight);
 Xpos[i] = Math.round(Math.random()*WinWidth);
 Speed[i]= Math.random()*5+3;
 Cstep[i]=0;
 Step[i]=Math.random()*0.1+0.05;
}
function fall(){
var WinHeight=(ns||ns6)?window.innerHeight:window.document.body.clientHeight;
var WinWidth=(ns||ns6)?window.innerWidth-70:window.document.body.clientWidth;
var hscrll=(ns||ns6)?window.pageYOffset:document.body.scrollTop;
var wscrll=(ns||ns6)?window.pageXOffset:document.body.scrollLeft;
for (i=0; i < Amount; i++){
sy = Speed[i]*Math.sin(90*Math.PI/180);
sx = Speed[i]*Math.cos(Cstep[i]);
Ypos[i]+=sy;
Xpos[i]+=sx; 
if (Ypos[i] > WinHeight){
Ypos[i]=-60;
Xpos[i]=Math.round(Math.random()*WinWidth);
Speed[i]=Math.random()*5+3;
}
if (ns){
document.layers['sn'+i].left=Xpos[i];
document.layers['sn'+i].top=Ypos[i]+hscrll;
}
else if (ns6){
document.getElementById("si"+i).style.left=Math.min(WinWidth,Xpos[i]);
document.getElementById("si"+i).style.top=Ypos[i]+hscrll;
}
else{
eval("document.all.si"+i).style.left=Xpos[i];
eval("document.all.si"+i).style.top=Ypos[i]+hscrll;
} 
Cstep[i]+=Step[i];
}
setTimeout('fall()',20);
}



