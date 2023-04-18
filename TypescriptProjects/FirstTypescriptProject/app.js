const http = require('http');//create server, tell it to listen on some port. 
//http is used to start the server
const port = 3000;//which port server should listen to
const fs = require('fs');//used to read the index.html file. This is a library file-handler.

//create server using http above. params: request, response.
const server = http.createServer(function(req, res) {

    //tell the browser that we will write html to index.html:
    res.writeHead(200, {'Content-Type': 'text/html'});
    fs.readFile('index.html', function(error, data) {
        if (error) {
            res.writeHead(404)
            res.write('Error');
        } else {
            res.write(data);
        }
        res.end();
    })

    //return a response to the user using Response res passed in (Response is a type)
    res.write('Hello Node');

})//handle requests for pages from server

//set up server so it listens to the desired port
server.listen(port, function(error) {
    if (error) {
        console.log('error occured', error);
    } else {
        console.log('server is live on port: ' + port);
    }
})

//to run the server: enter "node app.js" in terminal (no quotes)
//end server: 'ctrl-c' command
//go to localhost:3000 to see "Hello Node"