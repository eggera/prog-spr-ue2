
 +++++++++++++++++++++++++++++++++++++
  PROGRAMMIERSPRACHEN VU ASSIGNMENT 2 
 +++++++++++++++++++++++++++++++++++++
   
 
 ******************************
 XML ELEMENTS NAMES (vorschlag)
 ******************************
  
  
 ----------------
 primitive aktion
 ----------------
 	
<call> unixcommand </call>
  
  
 -------
 sequenz
 -------
  
  
<seq> 
  <call> unixcommand </call>
  <make patern='*.mp3'> 
    <call> unixcommand </call>
  </make>
    		...
</seq>
  
  
 -----------
 alternative
 -----------
  
  
 <alt>
   <call> unixcommand </call>
   <make pattern='*.mp3'>
      <call> unixcommand </call>
   </make>			
    		...
 </alt>
  
  
 -------------
 mengen-aktion
 -------------
  
  
 <make pattern='*.mp3'>
    <call> unixcommand </call>
 </make>	
  
 --------
 Schleife
 --------
  
  
 <loop>
   <call> unixcommand </call>
 </loop>
  
  
 <loop>
   <make pattern='*.mp3'>
     <call> unixcommand> </call>
   </make>
 </loop>
    
  
  
 
 
 
