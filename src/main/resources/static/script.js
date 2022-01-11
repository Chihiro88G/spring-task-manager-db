
window.onload = function() {
    var d = new Date();
    var date = d.getDate();
    var year = d.getFullYear();
    var month = d.getMonth();
    var monthArr = ["January", "February","March", "April", "May", "June", "July", "August", "September", "October", "November","December"];
    month = monthArr[month];
    document.getElementById("date").innerHTML=date+" "+month+", "+year;
};

function checkboxChecked(checkboxElem) {

    var boxNum = 'colorchange' + checkboxElem.id.substring(1,2)
    var content = document.getElementById(boxNum);

    if (checkboxElem.checked) {
        if (content.value == "") {
            alert("No content")
        }
        content.style.color = 'grey';
        content.disabled = true;
    }else{
        content.style.color = 'black';
        content.disabled = false;
    }
  }

  function pushResetButton() {
    //window.location.reload(true);
    location.href = 'http://localhost:8080/';
}