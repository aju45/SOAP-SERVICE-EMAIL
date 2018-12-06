# SOAP-SERVICE-EMAIL
import SoapServiceEmail as Java Dynamic Web Project

1. Generate wsdl file
2. Test

# Generate wsdl file

1. project folder >Right click > New > Other > Web Service > Web Service and hit Next.

2. Select Web service type to 'Bottom Up Java bean Web Service'.

3. Browse your service file to 'Service implementation' field, here it is "EmailServiceImpl".

4. Move the slider of client to set of client generation ,service must be started to enable client generation.
   (Move slider to start level or above test level).
   
5. If you want any client configuration, you can do there,otherwise leave the rest as it is.

6. After all procedure click Finish

# Test

Test after run the SoapServiceEmail on server !!!

1.Using SoapUi
  
  a.  Download SoapUI App from here https://www.soapui.org/downloads/soapui.html
  
  b.  File -> New SOAP Project
  
  c.  Enter your "wsdlsoap address loacation + ?wsdl" to Initial WSDL field. You can find your wsdlsoap address location from 
     project folder > WebContent > wsdl > your generated wsdl file, inside this file you can find url inside "<wsdlsoap:address />" tag
     here it is "http://localhost:8083/SOAPServiceEmail/services/EmailServiceImpl?wsdl".
     
  d.  After creating SOAP project, you will see a Request 1, When you click Request 1 it will show a window with XML request and response,
     Submit the mwssage after putting required data in request XML, Then response XML genrated 
     
    
     
2.Using Client program, You can find client code from https://github.com/aju45/SOAP-SERVICE-EMAIL-CLIENT
 
 
     
