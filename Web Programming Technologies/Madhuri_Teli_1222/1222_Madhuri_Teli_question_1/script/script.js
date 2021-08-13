$(document).ready(function () {
    $("#addPara").click(function () {
        $("#changeBackground").before(" <p>Newly added paragraph</p>");
    });

    $(".addButton").click(function () {


        var element = document.createElement("button");
        element.type = "button";
        element.className = "addButton";
        element.value = "Add Button";

    });

});
function test() {
    var r = $("<input/>").attr({
        type: "button",
        id: "field",
        class: "addButton",
        value: "Add Button",
        onclick: "test()",
    });

    $("body").append(r);
}