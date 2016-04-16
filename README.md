Programming Assignment
======================
Ad Client Activation Server

#### Abstract
 
Widespace customers integrates the Widespace Ad SDK (a.k.a Client) into their mobile apps in order to show ads and generate revenue.

The Client should query the Widespace Ad Client Activation Server (a.k.a Server) every time the mobile app is started. The Server returns information to Client how it should be configured and behave during the lifetime of app.

The assignment is to design and build a limited version of the Ad Client Activation Server.

#### Objective
The objective is to design and build a simple server which clients query to check if they should be activated or disabled.

The Client sends an id on uuid format identifying a mobile app to Server, the Server lookups status for id in a database table. The server compiles a response back to Client containing a flag if Client should be enabled or disabled.

The task is to design a Client API and implement the Server side for it.

##### The design criterias:
* The server should be performant
* The API should be REST based, response should be in json format
* One database table to hold the statuses 
* The number of app ids used is a limited set while the number of client instances are “unlimited”, i.e. id/status is a good candidate for caching
* Every access should be logged to file with timestamp, app id and returned status

##### The implementation criterias:
* Java v1.7 or later
* Use JEE 6 or later
* Use JAX-RS to receive API calls
* Use JPA for database access
* The Server should be implemented and packaged as an standalone war file
* Maven
* MySQL

##### Test criteria:
* The Server should be tested with blackbox junit tests. I.e. create standalone junit tests that fires API requests and validates responses. Use pre-configured statuses in database table.

Use an IDE and Java EE Web Profile Container of your own choice.


#### Deliverables

We want following deliverables for this assignment:

* The project as a zip file
* mysqldump of database including data needed for test cases




appserver
=========
App Server service.

1. MySQL database dump is in project root directory named "appserver.sql".
2. The service URL path is /app/{id}
3. There a test file under appserver-ws module. To run the test file please ensure the correct baseURL variable.
