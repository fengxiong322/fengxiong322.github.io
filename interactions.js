  var mouseOn = false;  

  function sideBar() {
    if( document.getElementsByTagName("ASIDE")[0].style.width == "250px"){
       document.getElementsByTagName("ASIDE")[0].style.width = "0px";
       document.getElementsByTagName("ASIDE")[0].style.padding = "0px 0px";
    }else{
      document.getElementsByTagName("ASIDE")[0].style.width = "250px";
      document.getElementsByTagName("ASIDE")[0].style.padding = "0px 10px";
    }
  }
  function displayAnswer(input) {
    if(document.getElementById(input).style.display == "block")
      document.getElementById(input).style.display = "none";
    else
      document.getElementById(input).style.display = "block";
  }
  window.onload = sideBar;

  window.addEventListener('scroll', function() {
    if(!mouseOn){
      if(pageYOffset > 100){
        document.getElementsByTagName("NAV")[0].style.opacity = "0";
      }else {
        document.getElementsByTagName("NAV")[0].style.opacity = "1";
      }
    }
  });