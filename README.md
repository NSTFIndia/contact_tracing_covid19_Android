# contact_tracing_covid19
Contact Tracing Android App for Carona COVID19

# Preface

History tells us that there are 2 effective ways of tackling any epidemic:
* Isolation / Social Distancing 
* Contact Tracing 
Based on our research on how previous pandemics like Ebola were handled and the current initiatives by the Singapore government to tackle Covid19, we propose a contact-tracing smartphone app to allow the local authorities to quickly track people who have been exposed to confirmed coronavirus cases.

Currently, contact tracing relies on the recall and memory of interviewees. Generally, there are instances when interviewees do not remember all their contacts or do not have information on whom they had been in contact with. The app will identify people who have been in close proximity at least a certain duration of time - to coronavirus patients using wireless Bluetooth technology. This is especially useful in cases where the infected persons do not know everyone whom they had been near for an extended duration.  The proposed App works by exchanging short-distance Bluetooth signals between phones to detect other participating App users close. Records of such encounters are stored locally on each user’s phone. If a user is interviewed by Health care officials as part of the contact tracing efforts, the officials can get all the relevant contact details of the interviewee.   

The key functionalities that the application fulfills are below:
* The app will identify people who have been in close proximity at least a certain duration of time - to coronavirus patients using wireless Bluetooth technology. This is especially useful in cases where the infected persons do not know everyone whom they had been in close proximity with for an extended duration.    
* This facilitates the contact tracing process and enables contact tracers to inform App users who are close contacts of COVID-19 cases more quickly. This enables users to take the necessary action sooner, such as monitoring their own health closely for signs of flu-like symptoms. Early detection could potentially help reduce the risk of the spread of the virus and better protect our families and loved ones.


# Feature List:

* Advertising over bluetooth LE with minimised payload (less than 31 bytes) 
  ** Mobile number (10 Bytes)
  ** GeoLocation -  lat, long  (20 Bytes)
* Discovering bluetooth LE advertisements.
* Creating SQLLite DB Schema to store advertised data.
** Contact number (Primary Key)
** Timestamp of first reception of advertised data by the above advertiser with above contact number.
** Delta Duration of advertiser seen.
** Lat
** Long
* CRUD  operation of SQLLite DB schema.
* View : Listing the stored list of advertisers from the DB.
* Foreground  thread switching implementation for Advertising and Scanning (discovering) with interval of 1 minute.


# Optional Feature List:

* Login with mobile number (OTP Verification).
* Reverse Geocoding API integration and visualising the advertised location.


