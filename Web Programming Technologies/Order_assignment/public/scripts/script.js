$(document).ready(function () {


    $("#btnReadOrder").click(function () {
        //R operation :Read Operation
        $.ajax({
            url: "/api/customerorders/1",
            type: 'GET',
            success: function (result) {
                console.log(result);
                for (i = 0; i < result.length; i++) {
                    $("#OrderDetails").append("<p>Order Date:" + result[i].o_date + "</p><br><p>Total Amount:" + result[i].t_amt + "</p>");
                }
                console.log("All Orders received from server , utlmately from database server");
            },
            error: function (err) {
                console.log(err);
            }
        });
    });

});