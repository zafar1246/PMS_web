$(document).ready(function() {
        //Reference the DropDownList.
        var ddlMonths = $("#ddlMonths");
 
        //Loop and add the Month values to DropDownList.
        for (var i = 1; i <=12; i++) {
            var option = $("<option />");
            
            if(i<10){
            	option.val("0"+i);
            	option.html("0"+i);
            } else{
            	option.html(i);	
            	option.val(i);
            }
            
            ddlMonths.append(option);
        }
        
        //Reference the DropDownList.
        var ddlYears = $("#ddlYears");
 
        //Loop and add the Year values to DropDownList.
        for (var i = 2021; i <= 2100; i++) {
            var option = $("<option />");
            option.html(i);
            option.val(i);
            ddlYears.append(option);
        }
    });
