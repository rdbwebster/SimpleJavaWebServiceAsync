This example is based on https://blogs.oracle.com/bwb/entry/create_an_asynchronous_jax_ws 
The Jdeveloper 11.1.1.5 application contains two projects

- A JAX-WS Web Service with both Sync and Async methods.
- A BPEL composite that calls the Service Asynchronously and waits for a
  callback

Deploy DepartmentDetailsServiceAsync to WLS Server with or without SOA Suite
Then test it in Enterprise Mgr  http://localhost:7001/em   (your server and port may vary)

Deploy CallDeparmentDetails to a WLS Server with SOA Suite.
The wsdl url must be changed in the partnerLink 
Deploy the projects one at a time by right clicking the project name.

Deploy DepartmentDetailsServiceAsync to WLS Server with or without SOA Suite
Then test it in Enterprise Mgr  http://localhost:7001/em   (your server and port may vary)

Deploy CallDeparmentDetails to a WLS Server with SOA Suite.
Note: before deploying this project The wsdl url must be changed 
in the departmentDetails partnerLink to match the local system.
Open the composite.xml and double click the departmentDetails partner link
In the resulting 'Update Reference' dialog box, paste the url to the deparmentDetailsServiceAsync WSDL
Then click the 'Port Type' field drop down box,  (Do not click the icons beside the WSDL URL field).
Build and Deploy the project

Test in Enterprise Manager using manager email address:

peterBaines@westco.com

The request will return immediately.
View the process instance status in EM to see the callback and payload.



