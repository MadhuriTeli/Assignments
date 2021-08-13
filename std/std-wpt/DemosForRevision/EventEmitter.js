var events=require("events");
var fs=require("fs");
var myeventEmitter=new events.EventEmitter();

myeventEmitter.on("myevent",function(data){
	console.log("in my event");
	console.log(data.toString());
});

fs.readFile("./DemoData/myfile.txt",function(err,data){
	if(err)
	{
		console.log("error");
	}
	else
	{
		console.log("generating event");
		myeventEmitter.emit("myevent",data);
	}
});












